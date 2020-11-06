package com.players.mvcflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.players.mvcflow.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService service;
	@RequestMapping(value="/list-todo",method=RequestMethod.GET)
	
public String mapData(ModelMap map )
{
		map.put("todosss",service.retrieve("praveen"));
		return "todo";
}
	
}
