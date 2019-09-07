package com.horariouniajc;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.horariouniajc.*" })
public class HorarioUniajcApplication {

	 @PostConstruct
     void started() {
       TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
     }
	
	public static void main(String[] args) {
		SpringApplication.run(HorarioUniajcApplication.class, args);
	}

}
