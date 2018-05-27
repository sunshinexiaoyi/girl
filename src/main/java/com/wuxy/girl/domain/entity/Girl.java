package com.wuxy.girl.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @program: girl
 * @description: girl类
 * @author: wuxy
 * @create: 2018-05-16 00:22
 **/
@Entity
public class Girl {
	@Id
	@GeneratedValue
	private Integer id;
	private String cupSize;
	private Integer age;

	public Girl() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
