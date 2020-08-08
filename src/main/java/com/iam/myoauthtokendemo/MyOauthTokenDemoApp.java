package com.iam.myoauthtokendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.iam.myoauthtokendemo" })
public class MyOauthTokenDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(MyOauthTokenDemoApp.class, args);
    }

}
