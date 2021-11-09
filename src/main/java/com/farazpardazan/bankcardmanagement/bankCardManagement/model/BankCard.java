package com.farazpardazan.bankcardmanagement.bankCardManagement.model;

import java.util.Date;

public class BankCard {
    private String id;// this id is not intrinsic/business  property of BankCard, it will be used at intra service communications .
    private int cvv2;
    private String cardNumber; //16 digits
    private  String cardOwnerName;
    private Date  expirationDate;
    private int secondPassword; // this must be  6 digits or more than 6 digits;


    public BankCard(int cvv2,String cardNumber,String cardOwnerName, Date expirationDate,int secondPassword){
      boolean isValid= validateBankCardNumber(cardNumber);
     //other  business verifications if they were needed
        this.cardNumber=cardNumber;
        this.cardOwnerName=cardOwnerName;
        this.cvv2=cvv2;
        this.expirationDate=expirationDate;
        this.secondPassword=secondPassword;
    }

    private boolean validateBankCardNumber(String cardNumber) {

     //   cardNumber must be just 16 digits , and its first 6 digits expresses a bank  which has published
        return  true;
    }

}
