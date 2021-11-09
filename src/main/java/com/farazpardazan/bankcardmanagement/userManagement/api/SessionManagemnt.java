package com.farazpardazan.bankcardmanagement.userManagement.api;

import com.farazpardazan.bankcardmanagement.userManagement.model.User;
import com.farazpardazan.bankcardmanagement.userManagement.model.UserCredential;

public interface SessionManagemnt {
     String createNewSession(User user);
     UserCredential getAuthorizedUserInfo(String sessionKey);
}
