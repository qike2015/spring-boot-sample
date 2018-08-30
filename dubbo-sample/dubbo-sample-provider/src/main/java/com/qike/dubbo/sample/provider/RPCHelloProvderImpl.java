package com.qike.dubbo.sample.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.qike.dubbo.sample.api.interfacep.HelloProvider;

/**
 * @author 豆丁
 * @since 2018/8/29
 */
@Service(version = "${provider.service.version}")
public class RPCHelloProvderImpl implements HelloProvider {

    public String hello(String message) {
        return message + " from provider";
    }
}
