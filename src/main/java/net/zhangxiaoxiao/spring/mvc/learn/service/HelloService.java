package net.zhangxiaoxiao.spring.mvc.learn.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 测试Java RMI的一个接口.
 *
 * @author zhangxiaoxiao
 */
public interface HelloService extends Remote {

    /**
     * 测试方法，打招呼.
     *
     * @return 打招呼的语句
     * @throws RemoteException 远程过程调用异常
     */
    String hello() throws RemoteException;
}
