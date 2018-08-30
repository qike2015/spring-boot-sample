package com.qike.dubbo.sample.consumer.bootstrap;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 卜可
 * @since 2018/8/29
 */
@EnableDubboConfig
@SpringBootApplication(scanBasePackages = "com.qike.dubbo.sample.consumer")
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class,args);
    }

}
