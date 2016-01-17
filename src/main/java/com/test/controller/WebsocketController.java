package com.test.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yzw on 2016/1/17.
 * build web socket
 */
@RestController
public class WebsocketController {


    public Object subscribe(){
        return "web socket test";
    }
}
