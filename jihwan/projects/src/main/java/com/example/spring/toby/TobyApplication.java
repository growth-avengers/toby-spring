package com.example.spring.toby;

import com.example.spring.toby.users.DUserDao;
import com.example.spring.toby.users.NUserDao;
import com.example.spring.toby.users.User;
import com.example.spring.toby.users.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class TobyApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		SpringApplication.run(TobyApplication.class, args);

		UserDao Ndao = new NUserDao();

		User user = new User();
		user.setId("1L");
		user.setName("토비");
		user.setPassword("1234");

		System.out.println(user.getId() + " 등록 성공");

		Ndao.add(user);

		User userId = Ndao.get(user.getId());
		System.out.println(userId.getName());
		System.out.println(userId.getPassword());

		System.out.println(userId.getId() + " 조회 성공");

		UserDao Ddao = new DUserDao();

		User user1 = new User();
		user1.setId("2L");
		user1.setName("토비2");
		user1.setPassword("1234");

		System.out.println(user1.getId() + " 등록 성공");

		Ddao.add(user);

		User userId2 = Ddao.get(user.getId());
		System.out.println(userId2.getName());
		System.out.println(userId2.getPassword());

		System.out.println(userId2.getId() + " 조회 성공");
	}

}
