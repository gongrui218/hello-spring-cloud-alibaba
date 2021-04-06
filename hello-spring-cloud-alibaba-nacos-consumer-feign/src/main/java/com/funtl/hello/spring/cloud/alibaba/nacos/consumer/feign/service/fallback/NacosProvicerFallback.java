package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class NacosProvicerFallback implements EchoService {
    @Override
    public String echo(String message) {
        return "请求失败,请检查你的网络";
    }
}
