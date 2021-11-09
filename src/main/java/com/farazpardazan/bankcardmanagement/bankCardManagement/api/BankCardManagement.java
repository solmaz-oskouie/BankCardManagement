package com.farazpardazan.bankcardmanagement.bankCardManagement.api;

import com.farazpardazan.bankcardmanagement.bankCardManagement.model.BankCard;

import java.util.List;

public interface BankCardManagement {
    BankCard addNewBankCard(BankCard bankCard);
    boolean removeExistBankCard(BankCard bankCard);
    List<BankCard> getUserBankCards(String userId);
}
