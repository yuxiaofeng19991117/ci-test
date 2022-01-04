package com.yuxiaofeng.citest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiTestApplicationTests {

    @Autowired
    MainService mainService;

    @Test
    public void testAdd() {
        int add = mainService.add(1, 2);
        assert add == 3;
        System.out.println("呵呵呵");
    }

}
