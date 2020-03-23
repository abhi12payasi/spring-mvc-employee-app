package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:app.properties")
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private Environment evr;

    @Bean
    public InternalResourceViewResolver ivr(){
        InternalResourceViewResolver i = new InternalResourceViewResolver();
        i.setPrefix(evr.getProperty("spring.mvc.prefix"));
        i.setSuffix(evr.getProperty("spring.mvc.suffix"));
        return i;
    }
}
