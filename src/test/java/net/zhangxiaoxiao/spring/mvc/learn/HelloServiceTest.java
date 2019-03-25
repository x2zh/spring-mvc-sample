package net.zhangxiaoxiao.spring.mvc.learn;


import net.zhangxiaoxiao.spring.mvc.learn.service.HelloService;
import net.zhangxiaoxiao.spring.mvc.learn.serviceimpl.HelloServiceImpl;
import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.*;


public class HelloServiceTest {

    @Test
    public void helloTest() throws RemoteException {
        HelloService helloService = new HelloServiceImpl();
        assertEquals(helloService.hello(), "zhangxiaoxiao");
        assertEquals(1, 1);
    }
}
