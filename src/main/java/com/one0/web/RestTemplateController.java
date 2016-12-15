package com.one0.web;

import com.one0.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by DT54 on 2016-11-07.
 */
@Controller
public class RestTemplateController {
    @Autowired
    private RestTemplateService restTemplateService;

    @GetMapping(value = "/")
    public void sendGetForIpus(){
        restTemplateService.restTemplate();
    }

}
