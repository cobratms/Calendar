package com.cobratms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dummy {

    @RequestMapping("/")
    public String index() {
        return "Lol, dummy :D";
    }
}
