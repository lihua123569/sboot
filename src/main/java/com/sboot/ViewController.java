/**  
 * Copyright © 2017猎宝网络科技股份有限公司. All rights reserved.
 *
 * @Title: ViewController.java
 * @Prject: mybatisplus-spring-boot
 * @Package: com.baomidou.springboot.controller
 * @Description: TODO
 * @author: lijh  
 * @date: 2017年2月16日 上午9:33:43
 * @version: V1.0  
 */
package com.sboot;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ViewController
 * @Description: 页面展示
 * @author: lijh
 * @date: 2017年2月16日 上午9:33:43
 */
@Controller
@RequestMapping("/view")
public class ViewController {

	@RequestMapping("/index")
	public String index(Map<String, Object> map) {
		System.out.println("--vv-");
		map.put("m", "m");

		return "index";
	}

	@RequestMapping(value="/getUser")
	public String getUser(){
		
		return "user";
	}
	
}
