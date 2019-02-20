package net.zhangxiaoxiao.spring.mvc.learn.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AutowireTest {
    private HttpServletRequest request;

    public AutowireTest(HttpServletRequest request) {
        this.request = request;
    }


    @RequestMapping(path = "foo")
    public String foo() {
        for (; ; ) {
            String id = request.getParameter("id");
            System.out.println(id);

        }
    }
}
