package com.redis.error;

import org.springframework.cache.Cache;
import org.springframework.cache.interceptor.CacheErrorHandler;

public class RedisCacheError implements CacheErrorHandler {

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
