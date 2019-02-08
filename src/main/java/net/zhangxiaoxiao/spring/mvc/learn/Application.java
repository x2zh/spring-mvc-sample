package net.zhangxiaoxiao.spring.mvc.learn;

import net.zhangxiaoxiao.spring.mvc.learn.web.WebMvcConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@ComponentScan
public class Application extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};

    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Application.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }
}