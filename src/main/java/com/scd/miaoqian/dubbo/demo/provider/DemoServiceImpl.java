package com.scd.miaoqian.dubbo.demo.provider;

import com.scd.miaoqian.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

}