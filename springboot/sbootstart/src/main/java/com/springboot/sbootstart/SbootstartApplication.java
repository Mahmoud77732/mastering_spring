package com.springboot.sbootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbootstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootstartApplication.class, args);
	}

}

/*
(1) add starter_web => create FunController => it's endpoints
(2) add starter-devtools => change intellij settings:
		select: settings > build, execution, deployment > compiler > check ""build project automatically
		select: settings > advanced settings > check compiler__"allow auto-make to start..."
*/
