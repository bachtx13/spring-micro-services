package com.bachtx.eurekaclientbook;

import com.bachtx.eurekaclientbook.controllers.GreetingController;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class EurekaClientBookApplication implements GreetingController {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientBookApplication.class, args);
	}
	@Lazy
	private final EurekaClient eurekaClient;
	@Value("${spring.application.name}")
	private String appName;

	@Override
	public String greeting() {
		return String.format(
				"Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}
}
