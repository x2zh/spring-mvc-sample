package net.zhangxiaoxiao.spring.mvc.learn.serviceimpl;

import net.zhangxiaoxiao.spring.mvc.learn.service.DubboDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DubboDemoServiceImpl implements DubboDemoService {

    private static final Logger log = LoggerFactory.getLogger(DubboDemoServiceImpl.class);

    @Override
    public String sayHello(String name) {

        log.error("hello method");
        return "Hello, " + name;
    }
}
