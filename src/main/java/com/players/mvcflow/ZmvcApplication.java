package com.players.mvcflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.players")
public class ZmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZmvcApplication.class, args);
	}

}
