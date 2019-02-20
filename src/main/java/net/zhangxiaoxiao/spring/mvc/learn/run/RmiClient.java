package net.zhangxiaoxiao.spring.mvc.learn.run;

import net.zhangxiaoxiao.spring.mvc.learn.service.HelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author zhangxiaoxiao005
 */
public class RmiClient {
    public static void main(String[] args) {
        try {
            HelloService helloService = (HelloService) Naming.lookup("rmi://127.0.0.1:7777/HelloService");
            System.out.println(helloService.hello());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
