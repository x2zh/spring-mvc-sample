package net.zhangxiaoxiao.spring.mvc.learn.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class TestController {

    private DataSource dataSource;

    public TestController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @RequestMapping("/main")
    public String main() {
        return "main";

    }
}
