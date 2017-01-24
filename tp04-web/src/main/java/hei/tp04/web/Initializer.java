package hei.tp04.web;

import hei.tp04.core.config.AppConfig;
import hei.tp04.core.config.DBConfig;
import hei.tp04.web.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Juan on 24/01/2017.
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        Class<?>[] twoClassTable = new Class<?>[2];
        twoClassTable[0] = AppConfig.class;
        twoClassTable[1] = DBConfig.class;
        return twoClassTable;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class<?>[] wcClassTable = new Class<?>[1];
        wcClassTable[0] = WebConfig.class;
        return wcClassTable;
    }

    @Override
    protected String[] getServletMappings() {
        String [] strTable = new String[1];
        strTable[0] = "/";
        return strTable;
    }
}
