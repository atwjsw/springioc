package com.imooc.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring/config.xml")
public class StoreConfig {

	@Bean(name = "storeVIP", initMethod = "start", destroyMethod = "stop")
	public Store stringStore() {
		return new StringStore();
	}

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	@Bean
	public MyDriverManager myDriverManager() {
		return new MyDriverManager(username, password, url);
	}
}
