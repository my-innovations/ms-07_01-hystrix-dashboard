package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class HystrixDashboardApp {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApp.class, args);
	}
}
