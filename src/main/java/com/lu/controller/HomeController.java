package com.lu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Majinping on 6/10/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "test";
    }
}
