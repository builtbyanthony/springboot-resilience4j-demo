package com.builtbyanthony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class RetrywithcbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetrywithcbApplication.class, args);
	}

}
