package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GuoLong
 */

@Controller
@RequestMapping(value = "/example")
public class ExampleController {

    private final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @RequestMapping("/index.do")
    public String loadExample(Model model) {
        model.addAttribute("pageTitle", "Example Freemarker Page");

        return "hello-world";
    }
}
