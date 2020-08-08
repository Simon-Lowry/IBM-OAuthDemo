package com.iam.myoauthtokendemo.services;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.iam.myoauthtokendemo.utils.Handler;

@Component
public class TokenService {
    @Autowired
    private Environment env;

    @Autowired
    private Handler utilHandler;

    Logger log = LoggerFactory.getLogger(TokenService.class);

    public JSONObject getTokenWithOAuthDetails(String code) {
        // add token post rest request here
        // parameters required for request: client id, client secret, grant type, response type, code, redirect uri
        // process response & return result
        return null;
    }

}
