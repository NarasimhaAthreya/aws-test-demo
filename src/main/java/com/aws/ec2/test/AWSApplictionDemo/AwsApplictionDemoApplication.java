package com.aws.ec2.test.AWSApplictionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aws.*")
public class AwsApplictionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsApplictionDemoApplication.class, args);
	}

}
