package com.players.mvcflow.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.springframework.stereotype.Service;

import com.players.mvcflow.model.Todo;


@Service
public class TodoService {
	
static List<Todo>	lists=new ArrayList<Todo>();

 static 
{
	lists.add(new Todo(1,"praveen",new Date(),false));
	
	lists.add(new Todo(2,"david",new Date(),false));
	
	lists.add(new Todo(3,"kumar",new Date(),false));
	
}
 
 public List<Todo> retrieve(String name)
 {
	 
 List<Todo> listed =new ArrayList<Todo>();
	 for(Todo list :lists)
	 {
		 if(list.getUser().equals(name))
		 {
				 listed.add(list);
	 }
 }
          return listed;
	 
}
}
	
	
