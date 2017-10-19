package com.aop.serviceImp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aop.mapper.UserMapper;
import com.aop.model.User;
import com.aop.model.UserExample;
import com.aop.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void addUser(User user) {
		
		userMapper.insert(user);
		System.out.println("添加成功");
	}

	@Override
	public void deleteUser(String name) {
		UserExample example=new UserExample();
		example.createCriteria().andUserNameEqualTo(name);		
		List<User> list=new ArrayList<User>();
		list=userMapper.selectByExample(example);
		userMapper.deleteByPrimaryKey(list.get(0).getId());
		System.out.println("删除成功");
	
	}
 
	
}
