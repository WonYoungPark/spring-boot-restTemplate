package com.one0.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Map;

/**
 * Created by DT54 on 2016-11-07.
 */
public class RestTemplateApiUtils {
    private static RestTemplate restTemplate;
    /**
     * Url을 조합한다.
     * @param domain
     * @param path
     * @return
     */
    private static String getUrl(String domain, String path) {
        return "https://" + domain + path;
    }

    /**
     * 보낼 메시지 크기가 짧거나 한글 메시지가 아닌 경우 GET으로 보낼 수 있다.
     * @param domain
     * @param path
     * @param params
     * @return Objects
     */
    public static String sendGet(String domain, String path, Map params) {
        return restTemplate.getForObject(getUrl(domain, path), String.class , params);
    }

    /**
     * 보낼 메시지 크기가 크거나 한글이 포함된 경우 POST로 보내는 것이 안전하다.
     * @param domain
     * @param path
     * @param params
     * @return Objects
     */
    public static void sendPost(String domain, String path,  Map params) {
        RestTemplate restTemplate = new RestTemplate();
        String body = null;
        try {
            body = new ObjectMapper().writeValueAsString(params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(body != null) {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
            HttpEntity httpEntity = new HttpEntity<>(body, httpHeaders);
            restTemplate.postForEntity(getUrl(domain, path), httpEntity, String.class, params);
        }
    }
}
