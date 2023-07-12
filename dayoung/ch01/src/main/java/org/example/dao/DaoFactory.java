package org.example.dao;

public class DaoFactory {
    private ConnectionMaker connectionMaker() {
        return new NConnectionMaker();
    }
    public UserDao userDao() {
        UserDao userDao = new UserDao(connectionMaker());
        return userDao;
    }
}
