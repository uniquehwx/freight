package com.bizcenter.freight.api;

import com.bitsun.core.common.annotation.IgnoreBgField;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * spring boot的入口
 * @author: hwx
 * @email: 745011692@qq.com
 */
@EnableSwagger2
/*
apollo不启用
@EnableApolloConfig({"application","mybatisplus", "jmtop.zipkin"})*/
@SpringBootApplication(scanBasePackages = {"com.bizcenter.freight","com.bitsun.core"})
//@EnableHystrix
//@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.bizcenter.freight.infrastructure.persistence.dao*")
@IgnoreBgField
public class FreightApplication {
    public static void main(String[] args) {
        SpringApplication.run(FreightApplication.class, args);
    }

}
