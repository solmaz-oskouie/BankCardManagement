package com.farazpardazan.bankcardmanagement.userManagement.api;

import com.farazpardazan.bankcardmanagement.userManagement.model.User;

public interface UserManagement {

    User createUser(User user);
    User getUser(String userId);

}
