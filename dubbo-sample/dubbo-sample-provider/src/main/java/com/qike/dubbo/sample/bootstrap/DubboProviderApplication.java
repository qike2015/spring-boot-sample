package com.qike.dubbo.sample.bootstrap;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author 卜可
 * @since 2018/8/29
 */
@EnableDubboConfig
@SpringBootApplication(scanBasePackages = "com.qike.dubbo.sample.provider")
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
