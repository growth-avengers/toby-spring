package org.example.dao;

import org.example.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao userDao = new DaoFactory().userDao();

        User user = new User();
        user.setId("0");
        user.setName("test");
        user.setPassword("testpw");
        userDao.add(user);

        User result = userDao.get("0");
        assertEquals("0", result.getId());
        System.out.println(result.getId());
        System.out.println(result.getName());
    }
}