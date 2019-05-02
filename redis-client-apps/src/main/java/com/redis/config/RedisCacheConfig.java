package com.redis.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {

	@Override
    public CacheErrorHandler errorHandler() {
        return new CacheErrorHandler();
    }

}
