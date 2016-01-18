package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yzw on 2016/1/17.
 * for test
 */
@RestController
public class TestController {

    @RequestMapping(path = "/follow",method = RequestMethod.GET)
    public Object follow(){
        return "follow fun";
    }
}
