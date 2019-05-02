package com.redis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.redis")
@EnableJpaRepositories("com.redis.repository")
@EntityScan("com.redis.model")
@EnableTransactionManagement
@EnableWebMvc
public class RedisClientApps {

	public static void main(String[] args) {
		SpringApplication.run(RedisClientApps.class, args);
	}
}
