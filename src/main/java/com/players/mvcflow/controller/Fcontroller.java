package com.players.mvcflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.players.dummy.DummyServices;
//simport com.players.dummy.DummyService;
import com.players.mvcflow.service.Fservice;
import com.players.mvcflow.service.TodoService;

@Controller
public class Fcontroller {
	
	@Autowired
	Fservice service;
	
	@Autowired
	
	TodoService todoservice;
	
	@Autowired
	DummyServices services;
	
	@RequestMapping(value="/flow-data" , method=RequestMethod.GET)

	public String flow(ModelMap map)
	{
		
		//map.addAttribute("t", name);
		
		return "index";
	}
	@RequestMapping(value="/flow-data",method=RequestMethod.POST)

	public String flow(ModelMap map,@RequestParam String name,@RequestParam String password)
	{
		
		boolean methodcall=service.dataValidat(name, password);
		
		if(!methodcall)
		{
			map.put("message", "Invalid Credentials");
			return "index";
		}
		
		map.addAttribute("name",name );
		map.addAttribute("password" ,password);
		
		return "welcome";
	}
}
