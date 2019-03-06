package net.zhangxiaoxiao.spring.mvc.learn;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 逆向工程生成Entity类，Mapper类以及对应的xml信息.
 *
 * @author zhangxiaoxiao
 */
public class MybatisGenerator {

    /**
     * 执行Mybatis generator.
     *
     * @param args 命令行参数
     * @throws Exception 配置文件出错时抛出异常
     */
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        String filePath = "C:\\Users\\zhangxiaoxiao005\\IdeaProjects\\"
                + "spring-mvc-sample\\src\\main\\resources\\mybatis\\"
                + "generator\\generatorConfig.xml";
        File configFile = new File(filePath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
