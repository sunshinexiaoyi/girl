package com.wuxy.girl.controller;

import com.wuxy.girl.property.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @program: girl
 * @description: hello
 * @author: wuxy
 * @create: 2018-05-14 23:49
 **/
@RestController
public class HelloController {
	@Value("${cupSize}")
	String cupSize;

	@Value("${age}")
	int age;

	@Value("${xiaoHong}")
	String xiaoHong;

	@Autowired
	GirlProperties girlProperties;

	@RequestMapping(value = "/say",method = RequestMethod.GET)
	public String say(){
		return "Hello Spring Boot!";

	}

	@RequestMapping(value={"/print","/print1"})
	public String print(){
		return "cupSize:"+cupSize
				+"\nage:"+age
				+"\nxiaoHong:"+xiaoHong
				+"\ngirl:"+girlProperties;
	}

	@RequestMapping(value = "/setGirl/{age}")
	public GirlProperties setGirl(@PathVariable int age){
		GirlProperties girlProperties = new GirlProperties();
		girlProperties.setAge(age);

		return girlProperties;
	}

	@RequestMapping(value = "/setGirl")
	public GirlProperties setGirl(@RequestParam int age,@RequestParam String cupSize){
		GirlProperties girlProperties = new GirlProperties();
		girlProperties.setAge(age);
		girlProperties.setCupSize(cupSize);

		return girlProperties;
	}


}
