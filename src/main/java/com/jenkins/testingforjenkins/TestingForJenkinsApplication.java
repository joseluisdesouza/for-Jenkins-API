package com.jenkins.testingforjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestingForJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingForJenkinsApplication.class, args);
	}

	@RestController
	@RequestMapping("/path")
	public static class Path{

		@RequestMapping("/name")
		public String pathName() {
			return "jenkins";
		}
	}
}
