package com.wuxy.girl.service;

import com.wuxy.girl.domain.entity.Girl;
import com.wuxy.girl.domain.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @program: girl
 * @description: girl服务
 * @author: wuxy
 * @create: 2018-05-16 23:42
 **/
@Service
public class GirlService {
	@Autowired
	private GirlRepository girlRepository;

	@Transactional
	public List<Girl> addGirls(@RequestBody List<Girl> girlList){
		return girlRepository.saveAll(girlList);
	}
}
