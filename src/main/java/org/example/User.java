package org.example;

public class User {


    public User(String log, String pass, boolean adminR)
    {
        login = log;
        password = pass;
        adminRights = adminR;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public boolean getAdminRight(){
        return adminRights;
    }

    private    String login;
    private    String password;
    private    boolean adminRights;


}
