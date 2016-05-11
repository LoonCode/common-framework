package com.exampleV3.controller;

import java.util.Map;

import com.alibaba.druid.support.json.JSONUtils;
import com.exampleV3.entity.User;
import com.exampleV3.service.UserService;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String loadExample(Model model) {
        model.addAttribute("pageTitle", "Example Freemarker Page");

        return "hello-world";
    }


    @RequestMapping("/jsonLoad")
    @ResponseBody
    public String jsonLoad(Model model) {
        model.addAttribute("pageTitle", "Example Freemarker Page");

        User user = userService.getUser();
        Map<String,String>  map = Maps.newHashMap();
        map.put("key","111");
        map.put("name",user.getFirstName());

        return JSONUtils.toJSONString(map);
//        retu;
    }
}
