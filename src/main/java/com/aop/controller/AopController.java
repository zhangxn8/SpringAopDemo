package com.aop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aop.mapper.UserMapper;
import com.aop.model.UserExample;

@Controller
@RequestMapping(value="/")
public class AopController {
 
	@Resource
	private UserMapper userMapper;
	
	@RequestMapping(value="test")
	public void test( HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("zxn");
		UserExample example=new UserExample();
		int count=userMapper.countByExample(example);
		System.out.println(count);
	//	response.setHeader("refresh", "5;URL=inter");
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		PrintWriter out=response.getWriter();
		out.write("恭喜你测试成功：5秒之后跳转刷新");
	}
}
