package com.farazpardazan.bankcardmanagement.userManagement.model;

public class User {
    private  String id;
    private  String username;
    private  String password; // password will be hashed before saved into  the DB
    private  Role rol;
}
