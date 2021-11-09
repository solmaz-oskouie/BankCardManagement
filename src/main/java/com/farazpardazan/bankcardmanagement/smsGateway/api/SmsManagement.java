package com.farazpardazan.bankcardmanagement.smsGateway.api;

import com.farazpardazan.bankcardmanagement.smsGateway.model.BankSms;

public interface SmsManagement {

    SmsResponse sendSms(BankSms bankSms);

}
