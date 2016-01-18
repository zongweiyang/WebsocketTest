package com.test.controller;

import com.test.service.Greeting;
import com.test.service.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yzw on 2016/1/17.
 * build web socket
 */
@RestController
public class WebsocketController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Object greeting(HelloMessage message) throws InterruptedException {
        System.out.println("message comming");
        Thread.sleep(3000); // simulated delay
        return new Greeting("hello, "+ message.getName() + "!");
    }
}
