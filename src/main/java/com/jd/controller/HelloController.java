package com.jd.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tuplock on 2016/11/17.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "Hello World~";
    }
}
