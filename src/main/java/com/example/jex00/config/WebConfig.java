package com.example.jex00.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Log4j2
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {

        log.info("1-------------------------");
        log.info("1-------------------------");
        return new Class[] {RootConfig.class};  //루트 설정
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        log.info("2-------------------------");
        log.info("2-------------------------");
        return new Class[] {ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {  //프론트 컨트롤러. mvc들어갈때 설명해주실것
        return new String[] {"/"};
    }
}
