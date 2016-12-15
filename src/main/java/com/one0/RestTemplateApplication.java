package com.one0;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.one0.domain.GetBerthUseResponse;
import com.one0.domain.GetBerthUseResponse_json;
import com.one0.domain.GetBerthUseResponse_xml;
import com.one0.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class RestTemplateApplication  {

	private static final Logger log = LoggerFactory.getLogger(RestTemplateApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
            Quote quote = restTemplate.getForObject(
                    "http://gturnquist-quoters.cfapps.io/api/random?_type=xml", Quote.class);
            log.info(quote.toString());

			final String DOMAIN      = "opendata.icpa.or.kr";
            final String PATH        = "/OpenAPI/service/ipaBerthUse/getBerthUse";
            final String SERVICE_KEY = "SK5P%2Bn%2BsxEe%2BvbCPp6ClVrpKHVlj1Kzzs%2Fp6P9NQkK5vcnq4rg%2BY3tczXVYKbQhYeeQJHjsuat%2FG3uf5O0TDAg%3D%3D";

			Map<String, Object> params = new HashMap<>();
			params.put("serviceKey", URLDecoder.decode(SERVICE_KEY, "UTF-8"));
			params.put("numOfRowa" , 10);
			params.put("skipRow"   , 0);
			params.put("endRow"    , (Integer) params.get("skipRow") + (Integer) params.get("numOfRowa"));
			params.put("_type"     , "xml");

//            방법2
//            URI uri = UriComponentsBuilder
//                    .newInstance()
//                    .scheme("https")
//                    .host(DOMAIN)
//                    .path(PATH)
//                    .queryParam("serviceKey", params.get("serviceKey"))
//                    .queryParam("numOfRowa" , params.get("numOfRowa" ))
//                    .queryParam("skipRow"   , params.get("skipRow"   ))
//                    .queryParam("endRow"    , params.get("endRow"    ))
//                    .queryParam("_type"     , params.get("_type"     ))
//                    .build()
//                    .encode()
//                    .toUri();
//
//            log.info(restTemplate.getForObject(uri, String.class).toString());

            // 자바 코드기반 Timeout 생성
            HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
            factory.setReadTimeout(1000 * 60 * 5);  // 5분
            factory.setConnectTimeout(5000);
            restTemplate.setRequestFactory(factory);

            // 주의 : RestTemplated의 기본 생성자는 StringHttpMessageConverter를 생성!!! 매번 생성하지 않아야 한다.
            // https://opendata.icpa.or.kr/OpenAPI/service/ipaBerthUse/getBerthUse?serviceKey=SK5P%2Bn%2BsxEe%2BvbCPp6ClVrpKHVlj1Kzzs%2Fp6P9NQkK5vcnq4rg%2BY3tczXVYKbQhYeeQJHjsuat%2FG3uf5O0TDAg%3D%3D&numOfRowa=10&skipRow=0&endRow=10&_type=xml
            log.info(restTemplate.getForObject("https://" + DOMAIN + PATH + "?serviceKey={serviceKey}&numOfRowa={numOfRowa}&skipRow={skipRow}&endRow={endRow}&_type={_type}", GetBerthUseResponse_xml.class, params).toString());

        };
    }
}
