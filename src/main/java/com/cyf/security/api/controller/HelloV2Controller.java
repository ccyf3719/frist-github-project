package com.cyf.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2021/03/08 15:47
 */
@RestController("helloController.cyf.v2")
@RequestMapping("/v2/hello")
public class HelloV2Controller {

	@GetMapping
	public String hello(){
		return "hello Admin";
	}
}
