package cn.studyhuang.dubbo.customer;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.studyhuang.dubbo.demo.DemoService;

public class Consumer {

	@Test
	public void fun1() {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		context.start();
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer2");
		System.out.println(demoService.sayHello("second consumer "));
		try {
			System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
