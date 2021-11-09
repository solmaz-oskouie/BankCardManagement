package com.farazpardazan.bankcardmanagement.bankServiceGateway.api;

import org.springframework.http.HttpStatus;

public class BankResponse {
    private HttpStatus statusCode;
    private String message;
    private String traceNumber;
    // other business properties;
}
