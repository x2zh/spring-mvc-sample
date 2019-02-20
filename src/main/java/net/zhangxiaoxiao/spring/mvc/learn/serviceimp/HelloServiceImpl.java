package net.zhangxiaoxiao.spring.mvc.learn.serviceimp;

import net.zhangxiaoxiao.spring.mvc.learn.service.HelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author zhangxiaoxiao005
 */
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    public HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String hello() throws RemoteException {
        return "zhangxiaoxiao";
    }
}
