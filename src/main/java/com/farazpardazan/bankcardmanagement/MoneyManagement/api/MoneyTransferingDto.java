package com.farazpardazan.bankcardmanagement.MoneyManagement.api;

import java.util.Date;

public class MoneyTransferingDto {
    private String sourceCardNumber;
    private String destinationCardNumber;
    private int amount;
    private Date expirationDate;
    private int secondPassword;
    private int cvv2;
}
