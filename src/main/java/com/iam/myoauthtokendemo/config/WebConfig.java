package com.iam.myoauthtokendemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    //TODO: still in progress for using webconfig to find and make use of webjars such as bootstrap & jquery for views
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");

        // addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
