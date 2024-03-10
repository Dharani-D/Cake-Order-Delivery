package com.example.Main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Main.Dto.cakeDto;
import com.example.Main.Service.cakeService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/cakeEntity")
public class cakecontroller {

	@Autowired
	private cakeService cake;
	
	@PostMapping(path = "/save")
	
	public String savecakeEntity(@RequestBody cakeDto cakedto)
	{
		String id = cake.addCakeEntity(cakedto);
		return id;
	}
}


