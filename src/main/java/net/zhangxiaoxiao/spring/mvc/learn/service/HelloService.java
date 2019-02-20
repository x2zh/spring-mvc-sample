package net.zhangxiaoxiao.spring.mvc.learn.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author zhangxiaoxiao005
 */
public interface HelloService extends Remote {
    /**
     * @return
     * @throws RemoteException
     */
    String hello() throws RemoteException;
}
