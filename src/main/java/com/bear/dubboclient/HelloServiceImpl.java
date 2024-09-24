package com.bear.dubboclient;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author LiuShanshan
 * @version V1.0
 * @Description
 */
@DubboService
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHelllo(String name) {
        return "你好：" +name;
    }
}
