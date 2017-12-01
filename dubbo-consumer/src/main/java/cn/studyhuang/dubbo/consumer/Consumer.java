package cn.studyhuang.dubbo.consumer;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.studyhuang.dubbo.demo.DemoService;



public class Consumer  {

	@Test
	public void fun2() {
		ClassPathXmlApplicationContext context=
				   new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		
		context.start();
		System.out.println("consumer start");
		DemoService service=context.getBean(DemoService.class);
		
		System.out.println("consumer ---"+service.sayHello("dubbox"));
		
		try {
			System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
