package com.demo.demoapi.adapter.inbound.communication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommonResponse {

    @JsonProperty("code")
    private final String code;

    @JsonProperty("message")
    private final String message;

    @JsonProperty("data")
    private Object data;

    public CommonResponse(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
