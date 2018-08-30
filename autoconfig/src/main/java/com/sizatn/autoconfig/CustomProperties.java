package com.sizatn.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @desc 属性类
 * @author sizatn
 * @date Aug 30, 2018
 */
@ConfigurationProperties(prefix = "custom")
public class CustomProperties {

	public static final String DEFAULT_AUTHOR = "sizatn";

	public String author = DEFAULT_AUTHOR;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
