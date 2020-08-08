package com.iam.myoauthtokendemo.utils;

import org.apache.http.HttpResponse;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Handler {
    Logger log = LoggerFactory.getLogger(Handler.class);

    public JSONObject handleJsonResponse(HttpResponse response) {
        return null;
    }

    public String decodeBase64String(String encodedString) {
        return null;
    }
}
