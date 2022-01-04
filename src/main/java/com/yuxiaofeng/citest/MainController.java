package com.yuxiaofeng.citest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MainController {

    @Resource
    MainService mainService;

    @GetMapping("/add")
    public int add(int a, int b) {
        return mainService.add(a, b);
    }

}
