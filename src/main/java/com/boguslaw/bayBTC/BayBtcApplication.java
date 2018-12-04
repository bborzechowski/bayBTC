package com.boguslaw.bayBTC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BayBtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BayBtcApplication.class, args);
	}
}
