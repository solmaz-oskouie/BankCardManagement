package com.farazpardazan.bankcardmanagement.MoneyManagement.model;


import java.util.Date;

public class MoneyTransaction {
    private  String id;
    private  String resourceCardNumber;
    private  String destinationCardNumber;
    private Date  transactionDateTime;
    private int amount ;  // as Fowler said , this property must have a Money type , for example BigDecimal , but here we keep it simple as much as possible
    private  int traceNumber;
    private  BankTransactionStatus status;
    // some  other business properties if they were needed.
}
