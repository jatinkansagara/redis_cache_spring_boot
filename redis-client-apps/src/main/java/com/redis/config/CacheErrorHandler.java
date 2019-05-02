package com.redis.config;

import org.springframework.cache.Cache;

public class CacheErrorHandler implements org.springframework.cache.interceptor.CacheErrorHandler {

	@Override
	public void handleCacheGetError(RuntimeException exception, Cache cache, Object key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCachePutError(RuntimeException exception, Cache cache, Object key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCacheEvictError(RuntimeException exception, Cache cache, Object key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCacheClearError(RuntimeException exception, Cache cache) {
		// TODO Auto-generated method stub
		
	}

}
