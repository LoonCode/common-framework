package com.example.controller;

import java.util.Map;

import com.alibaba.druid.support.json.JSONUtils;
import com.example.entity.User;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author GuoLong
 */

@Controller
@RequestMapping(value = "")
public class ExampleController {

    private final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @RequestMapping("/index")
    public String loadExample(Model model) {
        model.addAttribute("pageTitle", "Example Freemarker Page");

        return "hello-world";
    }


    @RequestMapping("/jsonLoad")
    @ResponseBody
    public String jsonLoad(Model model) {
        model.addAttribute("pageTitle", "Example Freemarker Page");

        User user = new User();
        user.setId("1");
        Map<String,String>  map = Maps.newHashMap();
        map.put("key","111");

        return JSONUtils.toJSONString(map);
//        retu;
    }
}
