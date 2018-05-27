package com.wuxy.girl.controller;

import com.wuxy.girl.domain.entity.Girl;
import com.wuxy.girl.domain.repository.GirlRepository;
import com.wuxy.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @program: girl
 * @description: girl控制器
 * @author: wuxy
 * @create: 2018-05-16 00:45
 **/
@RestController
public class GirlController {
	@Autowired
	private GirlRepository girlRepository;

	@Autowired
	private GirlService girlService;

	@GetMapping(value = "/girl")
	public List<Girl> getGirlList(){
		return girlRepository.findAll();
	}

	@GetMapping("/getGirl/{id}")
	public Optional<Girl> getGirl(@PathVariable Integer id){
		System.out.println("getGirl:id:"+id);
		return girlRepository.findById(id);
	}

	@GetMapping("/getGirlByAge/{age}")
	public List<Girl> getGirlByAge(@PathVariable Integer age) {
		System.out.println("getGirl:id:" + age);
		return girlRepository.findByAge(age);
	}

	@PostMapping("addGirl")
	public Girl addGirl(@RequestBody Girl girl){
		return girlRepository.save(girl);
	}

	@DeleteMapping("deleteGirl/{id}")
	public void deleteGirl(@PathVariable Integer id){
		girlRepository.deleteById(id);
	}

	@PutMapping("updateGirl")
	public Girl updateGirl(@RequestBody Girl girl){
		return girlRepository.save(girl);
	}

	@PostMapping("/addGirls")
	public List<Girl> addGirls(@RequestBody List<Girl> girlList){
		return girlService.addGirls(girlList);
	}

}
