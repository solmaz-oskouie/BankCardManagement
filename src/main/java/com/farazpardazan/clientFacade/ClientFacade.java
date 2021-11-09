package com.farazpardazan.clientFacade;

import com.farazpardazan.bankcardmanagement.MoneyManagement.api.MoneyTransferingDto;
import com.farazpardazan.bankcardmanagement.MoneyManagement.model.MoneyTransaction;
import com.farazpardazan.bankcardmanagement.bankCardManagement.model.BankCard;
import com.farazpardazan.bankcardmanagement.moneyAndBankCardReport.model.MoneyTransactionDto;


import java.util.Date;
import java.util.List;

public interface ClientFacade {
    //bank card management APIs from point view of the  client (end user who is using a web/mobile app)
    BankCard addNewCard(BankCard bankCard);
    boolean removeBankCard(String bankCardId);
    List<BankCard> getAllUserBankCards(String userSessionKey);

    //money transferring  management APIs from point view of  the client (end user who is using a web/mobile app)
    boolean transferMoney(MoneyTransferingDto moneyTransferingDto);

    //money and bank card reporting  APIs from point view of  the client (end user who is using a web/mobile app)
    List<MoneyTransaction> getBankCardTransactions(String userId , String bankCardId, Date from , Date to);
    List<MoneyTransactionDto>getAllBankCardsAllTransactions(String userId, Date from, Date to);
}
