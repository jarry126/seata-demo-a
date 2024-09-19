package com.bear;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LiuShanshan
 * @version V1.0
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoDataSourceProxy
@EnableFeignClients
@MapperScan("com.bear.mapper")
public class SpringBootSeateDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSeateDemoApplication.class, args);
    }
}
