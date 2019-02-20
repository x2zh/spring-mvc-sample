package net.zhangxiaoxiao.spring.mvc.learn.run;

import net.zhangxiaoxiao.spring.mvc.learn.service.HelloService;
import net.zhangxiaoxiao.spring.mvc.learn.serviceimp.HelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author zhangxiaoxiao005
 */
public class RmiServer {
    public static void main(String[] args) {

        final int port = 7777;
        try {
            HelloService helloService = new HelloServiceImpl();
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://127.0.0.1:" + port + "/HelloService", helloService);
            System.out.println("服务已经启动");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
