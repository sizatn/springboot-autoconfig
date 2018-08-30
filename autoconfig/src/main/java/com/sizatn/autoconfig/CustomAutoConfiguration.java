package com.sizatn.autoconfig;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({ CustomService.class })
@EnableConfigurationProperties(CustomProperties.class)
public class CustomAutoConfiguration {
	
	@Resource
	private CustomProperties customProperties;

	@Bean
	@ConditionalOnMissingBean(CustomService.class)
	@ConditionalOnProperty(name = "custom.author.enabled", matchIfMissing = true)
	public CustomService customResolver() {
		CustomService customService = new CustomService();
		customService.setAuthor(customProperties.getAuthor());
		return customService;
	}
}
