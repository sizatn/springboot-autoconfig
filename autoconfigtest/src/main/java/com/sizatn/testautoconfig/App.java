package com.sizatn.testautoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sizatn.autoconfig.CustomService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.sizatn"}) 
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
		CustomService bean = ctx.getBean(CustomService.class);
		System.out.println(bean.getAuthor());
	}
}