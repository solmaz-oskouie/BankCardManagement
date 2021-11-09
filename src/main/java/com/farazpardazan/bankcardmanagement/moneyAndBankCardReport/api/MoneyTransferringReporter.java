package com.farazpardazan.bankcardmanagement.moneyAndBankCardReport.api;

import com.farazpardazan.bankcardmanagement.MoneyManagement.model.MoneyTransaction;
import com.farazpardazan.bankcardmanagement.moneyAndBankCardReport.model.MoneyTransactionDto;

import java.util.Date;
import java.util.List;

public interface MoneyTransferringReporter {
    /*
    this method will be called
    whenever user specifies which bank card he/she wants to see its transaction reports at specified interval.
     */
    List<MoneyTransaction> getBankCardTransactions(String userId , String bankCardId, Date from ,Date to);

    // this method will be returned all bank card's transactions at specified interval.
    List<MoneyTransactionDto>getAllBankCardsAllTransactions(String userId,Date from, Date to);
}
