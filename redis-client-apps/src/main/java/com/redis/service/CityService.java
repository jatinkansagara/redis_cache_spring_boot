package com.redis.service;

public interface CityService {

	String getCityNameByCityId(String cityId);

	String updateCityNameByCityId(String cityId, String cityName);
	
	void cleanCityCache();
}
