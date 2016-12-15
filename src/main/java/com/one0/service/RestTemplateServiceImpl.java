package com.one0.service;

import com.one0.common.utils.RestTemplateApiUtils;
import org.springframework.stereotype.Service;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DT54 on 2016-11-07.
 */
@Service
public class RestTemplateServiceImpl implements RestTemplateService{

    public String restTemplate() {
        String domain = "opendata.icpa.or.kr";
        String path = "/OpenAPI/service/ipaBerthUse/getBerthUse";
        String serviceKey = "SK5P%2Bn%2BsxEe%2BvbCPp6ClVrpKHVlj1Kzzs%2Fp6P9NQkK5vcnq4rg%2BY3tczXVYKbQhYeeQJHjsuat%2FG3uf5O0TDAg%3D%3D";
        System.out.println("시작");
//        RestTemplate restTemplate = new RestTemplate();
//
//        URI uri = UriComponentsBuilder.newInstance()
//                .scheme("http")
//                .host(url)
//                .path(path)
//                .queryParam("ServiceKey", URLDecoder.decode(serviceKey, "UTF-8")) // 서비스 키
//                .queryParam("", (String) "")
//                .build()
//                .encode()
//                .toUri();
//
//        // 오브젝트로 결과 값 받아오기
//        restTemplate.getForObject(uri, String.class);
        try {
            System.out.println("시작1");
            // 요청 파라미터
            Map<String, Object> params = new HashMap<>();
            params.put("serviceKey", URLDecoder.decode(serviceKey, "UTF-8"));
            //params.put("serviceKey"   , serviceKey);
            params.put("numOfRows", 10);
            params.put("skipRow", 2);
            params.put("endRow", (Integer) params.get("skipRow") + (Integer) params.get("numOfRows"));
//        params.put("endRow"       , "10"); // 마지막줄
//        params.put("skipRow"      , "0"); // 스킵한 시작위치
//        params.put("numOfRowa"    , "10"); // 조회 줄수
//        params.put("pltPlanDtFrom", "20161101"); // 한페이지 결과 후
//        params.put("pltPlanDtTo"  , "20161102"); // 예정일자 to(페이 번호)
//        params.put("callLetter"   , "1"); // 호출부호(1:필수, 0:옵션)
            System.out.println("시작2");
            //RestTemplateApiUtils.sendGet(domain, path, params);
            System.out.println(RestTemplateApiUtils.sendGet(domain, path, params));
            System.out.println("완료");
        } catch(Exception e) {

        }

        return "1";
    }
}
