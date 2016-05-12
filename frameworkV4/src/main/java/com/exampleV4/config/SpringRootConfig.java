package com.exampleV4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author GuoLong
 */
@Configuration
@ComponentScan(basePackages = "com.exampleV3.service.*")
@Import(value = {
        DataSourceConfig.class
} )
public class SpringRootConfig {
}
