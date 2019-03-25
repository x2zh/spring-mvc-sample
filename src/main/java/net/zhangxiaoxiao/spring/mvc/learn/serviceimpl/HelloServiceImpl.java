package net.zhangxiaoxiao.spring.mvc.learn.serviceimpl;

import net.zhangxiaoxiao.spring.mvc.learn.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 测试Java RMI 测试代码.
 *
 * @author zhangxiaoxiao
 */
@Transactional
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    public HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String hello() {
        return "zhangxiaoxiao";
    }
}
