package com.zero.validation.controller;

import com.alibaba.fastjson2.JSONObject;
import com.zero.validation.domain.entity.SystemUserEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/validation")
public class ValidationController {

    @RequestMapping("/hello")
    public Map<String, Object> showHelloWorld(@RequestBody @Validated SystemUserEntity req){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", JSONObject.toJSONString(req));
        return map;
    }

}