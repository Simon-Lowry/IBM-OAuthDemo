package com.iam.myoauthtokendemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iam.myoauthtokendemo.services.TokenService;

@Controller
@RequestMapping("/api/v1")
public class OAuthController {

    @Autowired
    TokenService tokenService;

    @Autowired
    private Environment env;

    Logger log = LoggerFactory.getLogger(OAuthController.class);

    @GetMapping("/")
    public ModelAndView index() {
        log.info("In Controller: return index page for triggering authentication and getting the authorization code");

        return null;
    }

    @GetMapping("/authorize")
    public ModelAndView getDecodedToken(@RequestParam String code) {
        log.info("Code from our call to auth: " + code);
        log.info("In Controller: generate token using the authorization code and display decoded token response");

        return null;
    }

}
