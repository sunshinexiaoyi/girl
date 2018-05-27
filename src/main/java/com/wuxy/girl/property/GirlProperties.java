package com.wuxy.girl.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: girl
 * @description: girl配置类
 * @author: wuxy
 * @create: 2018-05-15 00:48
 **/
@Component	//配置这才能被找到该bean
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
	private String cupSize;
	private int age;

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return 	"===girl配置类==="
				+"cupSize:"+getCupSize()
				+"age:"+getAge();
	}
}
