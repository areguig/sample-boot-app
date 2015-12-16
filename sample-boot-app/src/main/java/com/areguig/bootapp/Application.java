package com.areguig.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import(AppConfig.class)
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class);
	}
}
