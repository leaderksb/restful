package com.ksb.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Main Class
@SpringBootApplication
public class RestfulApplication {

	public static void main(String[] args) {
		// Spring Boot Application 시작
		SpringApplication.run(RestfulApplication.class, args);

		// Bean 등록 정보 확인
//		ApplicationContext ac = SpringApplication.run(RestfulApplication.class, args);
//
//		String[] allBeanNames = ac.getBeanDefinitionNames();
//
//		for (String beanName : allBeanNames) {
//			System.out.println(beanName);
//		}
	}
}
