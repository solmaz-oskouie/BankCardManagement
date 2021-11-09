package com.farazpardazan.bankcardmanagement.bankServiceGateway.api;

import com.farazpardazan.bankcardmanagement.MoneyManagement.api.MoneyTransferingDto;
import com.farazpardazan.bankcardmanagement.bankCardManagement.model.BankCard;

public interface MoneyTransferring {

    BankResponse transferMoney(MoneyTransferingDto moneyTransferingDto, String bankPin);
}
