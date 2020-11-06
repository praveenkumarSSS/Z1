package com.players.mvcflow.service;

import org.springframework.stereotype.Component;

@Component
public class Fservice {
	
	public boolean dataValidat(String name,String password)
	{
		return name.equalsIgnoreCase("praveen") && password.equalsIgnoreCase("praveen");
	}

}
