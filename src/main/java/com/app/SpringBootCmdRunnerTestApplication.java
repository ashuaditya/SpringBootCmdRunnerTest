package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCmdRunnerTestApplication {

	public static void main(String[] args) {
		System.out.println("MyStarter Starting.........");
		SpringApplication.run(SpringBootCmdRunnerTestApplication.class, args);

		System.out.println("MyStarter Ending.........");
	}

}
