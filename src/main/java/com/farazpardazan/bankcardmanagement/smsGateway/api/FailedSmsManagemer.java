package com.farazpardazan.bankcardmanagement.smsGateway.api;

import com.farazpardazan.bankcardmanagement.smsGateway.model.BankSms;

public interface FailedSmsManagemer {
    int sendFailedSmsToQueue(BankSms bankSms);
    BankSms retrieveFailedBankSms(); // this method could be called by a job  to send failed bank sms  to the  user again .
}

