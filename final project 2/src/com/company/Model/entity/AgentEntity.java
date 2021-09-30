package com.company.Model.entity;

/**
 * Created by Sara on 12/25/2019.
 */
public class AgentEntity implements User{

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public AgentEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AgentEntity setPassword(String password) {
        this.password = password;
        return this;
    }
}
