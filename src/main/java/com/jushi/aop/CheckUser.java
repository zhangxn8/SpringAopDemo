package com.jushi.aop;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CheckUser {

	//@Pointcut("execution(* com.jushi.aop.*.find*(..))")
	public void checkUser(){
		System.out.println("**************The System is Searching Information For You****************");
	}
	
	//@Pointcut("execution(* com.jushi.aop.*.add*(..))")
	public void checkAdd(){
		System.out.println("**************<< Add User >> Checking.....***************");
	}
	
	//@Before("checkUser()")
	public void beforeCheck(){
		System.out.println(">>>>>>>> 准备搜查用户..........");
	}
	
	//@After("checkUser()")
	public void afterCheck(){
		System.out.println(">>>>>>>>　搜查用户完毕..........");
	}

	//@Before("checkAdd()")
	public void beforeAdd(){
		System.out.println(">>>>>>>>　增加用户--检查ing..........");
	}
	
	//@After("checkAdd()")
	public void afterAdd(){
		System.out.println(">>>>>>>>　增加用户--检查完毕！未发现异常!..........");
	}
}
