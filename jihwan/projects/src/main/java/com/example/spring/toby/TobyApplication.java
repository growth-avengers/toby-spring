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

		System.out.println(user.getId() + " 등록 성공");

		dao.add(user);

		User userId = dao.get(user.getId());
		System.out.println(userId.getName());
		System.out.println(userId.getPassword());

		System.out.println(userId.getId() + " 조회 성공");
	}

}
