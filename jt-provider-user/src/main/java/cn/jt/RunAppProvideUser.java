package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient   //会找服务   通过yml
public class RunAppProvideUser {
	
	public static void main(String[] args) {
		SpringApplication.run(RunAppProvideUser.class, args);
	}
}
