package net.zhangxiaoxiao.spring.mvc.learn.run;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zhangxiaoxiao005
 */
public class ClassResourceLoaderTest {
    public static void main(String[] args) {
        String defaultFileName = "foo.properties";
        Class<ClassResourceLoaderTest> clazz = ClassResourceLoaderTest.class;
        InputStream is = clazz.getResourceAsStream(defaultFileName);
        if (is == null) {
            System.out.println("can't get input stream from class path, please check file name");
            return;
        }
        Properties defaultStrategies = new Properties();
        try {
            defaultStrategies.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        defaultStrategies.list(System.out);
        System.out.println(defaultStrategies.getProperty("name"));
    }
}
