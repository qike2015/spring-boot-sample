package com.buke.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 豆丁
 * @since 2019/1/21
 */
@Component
@RabbitListener(queues = "buke")
public class Customer1 {

    @RabbitHandler
    public void accept(String message) {

        System.out.println("buke:" + message);
    }

}
