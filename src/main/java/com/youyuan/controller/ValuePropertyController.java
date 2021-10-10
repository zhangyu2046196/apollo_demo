package com.youyuan.controller;

import com.youyuan.config.ValueStyleProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 类名称：ValuePropertyController <br>
 * 类描述： 测试apollo配置中心controller <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2021/10/10 15:23<br>
 */
@RestController
@RequestMapping("/value-style")
public class ValuePropertyController {
    @Autowired
    private ValueStyleProperty keyProperty;

    @Value("${server.port}")
    private String port;

    @Value("${apollo.bootstrap.namespaces:'application'}")
    private String namespaces;

    @GetMapping("/get")
    public Map<String, Object> getProperty() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("port", port);
        map.put("namespaces", namespaces);
        map.put("demoKey1", keyProperty.getDemoKey1());
        map.put("demoKey2", keyProperty.getDemoKey2());
        return map;
    }
}
