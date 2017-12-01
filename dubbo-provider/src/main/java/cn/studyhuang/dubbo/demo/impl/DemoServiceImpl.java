package cn.studyhuang.dubbo.demo.impl;

import cn.studyhuang.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		
		return "hello"+name;
	}

}
