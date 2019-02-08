package net.zhangxiaoxiao.spring.mvc.learn.web.servlet;

import net.zhangxiaoxiao.spring.mvc.learn.dao.CityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "hello", urlPatterns = "/hello", loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebApplicationContext webApplicationContext = RequestContextUtils.findWebApplicationContext(req);
        if (webApplicationContext != null) {
            CityMapper mapper = webApplicationContext.getBean(CityMapper.class);
            String[] names = webApplicationContext.getBeanDefinitionNames();
            log.info("bean counts: {} bean names: {}", names.length, Arrays.toString(names));
            resp.getWriter().write(mapper.getCity(1).toString());
            webApplicationContext.getServletContext();
            log.info("application context 的 id 为: {}", webApplicationContext.getId());
        }
        resp.getWriter().write("<h1>hello world</h1>");
        resp.setHeader("content", "text/html");
        ServletContext servletContext = req.getServletContext();
        req.getServletContext();
    }
}
