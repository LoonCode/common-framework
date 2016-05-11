package com.exampleV3.config.viewResolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @author GuoLong
 */
public class JsonViewResolver  implements ViewResolver {
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {

        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }
}
