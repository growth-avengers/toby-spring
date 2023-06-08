package com.example.spring.toby;

import com.example.spring.toby.users.User;
import com.example.spring.toby.users.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class TobyApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		SpringApplication.run(TobyApplication.class, args);

		UserDao dao = new UserDao();

		User user = new User();
		user.setId("1L");
		user.setName("토비");
		user.setPassword("1234");

		dao.add(user);
	}

}
