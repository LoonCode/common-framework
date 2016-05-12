package com.exampleV4.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.env.AbstractEnvironment;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * replace web.xml.bak
 * @author GuoLong
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SpringRootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        super.onStartup(servletContext);

        servletContext.setInitParameter(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "loacl");
    }


}
