package com.aop.service;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.stereotype.Service;

import com.aop.model.User;


public interface UserService {
  
	public void addUser(User user);
	
	public void deleteUser(String name);

}
