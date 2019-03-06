package net.zhangxiaoxiao.spring.mvc.learn.serviceimp;

import net.zhangxiaoxiao.spring.mvc.learn.service.HelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 测试Java RMI 测试代码.
 *
 * @author zhangxiaoxiao
 */
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    public HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String hello() {
        return "zhangxiaoxiao";
    }
}
