package com.jushi.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jushi.entity.User;

public class Test {
	
	public static void main(String as[]){
		BeanFactory factory = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
		IUser user = (IUser) factory.getBean("user");
//		user.findAll();
		
		User u = new User();
//		u.setUsername("Tom");
//		user.findUser(u.getUsername());
		
		u.setUsername("haha");
		user.addUser(u.getUsername());
	}
}
