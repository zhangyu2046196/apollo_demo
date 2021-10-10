package com.youyuan.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类名称：ValueStyleProperty <br>
 * 类描述： 读取apollo配置中心配置信息 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2021/10/10 15:22<br>
 */
@Component
@Data
public class ValueStyleProperty {

    @Value("${apollo.value.demoKey1}")
    private String demoKey1;

    @Value("${apollo.value.demoKey2}")
    private String demoKey2;
}
