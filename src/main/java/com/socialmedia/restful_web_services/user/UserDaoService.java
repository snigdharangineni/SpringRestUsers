package com.socialmedia.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component 
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	

	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Sofie", LocalDate.now().minusYears(20)));
		users.add(new User(3, "Likki", LocalDate.now().minusYears(10)));
		users.add(new User(4, "Tinku", LocalDate.now().minusYears(5)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}
