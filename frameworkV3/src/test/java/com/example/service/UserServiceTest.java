package com.example.service;

import com.exampleV3.config.SpringRootConfig;
import com.exampleV3.config.SpringWebConfig;
import com.exampleV3.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "dev")
@WebAppConfiguration
@ContextConfiguration(classes = { SpringWebConfig.class, SpringRootConfig.class})
public class UserServiceTest {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);


    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() throws Exception {

        LOGGER.debug(userService.getUser().toString());
    }
}