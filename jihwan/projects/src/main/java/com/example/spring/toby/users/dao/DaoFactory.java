package com.example.spring.toby.users.dao;

import com.example.spring.toby.users.ConnectionMaker;
import com.example.spring.toby.users.DConnectionMaker;

public class DaoFactory {
    public UserDao userDao () {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        return new UserDao(connectionMaker);
    }

    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
