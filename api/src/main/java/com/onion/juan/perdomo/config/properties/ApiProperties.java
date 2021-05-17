package com.onion.juan.perdomo.config.properties;

import org.springframework.beans.factory.annotation.Value;

public class ApiProperties {

    @Value("$[api.basepath]")
    public static final String API_BASE_PATH = "/api";
}
