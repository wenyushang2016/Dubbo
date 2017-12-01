package cn.studyhuang.dubbo.demo.impl;
import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动远程服务
 * 
 * */
public class Provider {
  @Test	
  public   void fun1() {
	  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-provider.xml");
	  System.out.println(context.getDisplayName()+"provider");
	  context.start();
	  System.out.println("远程服务开启");
	  try {
		System.in.read();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
 }
}
