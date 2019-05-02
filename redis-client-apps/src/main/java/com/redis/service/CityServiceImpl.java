package com.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.redis.model.MstCity;
import com.redis.repository.MstCityRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private MstCityRepository mstCityRepository;
	
	@Override
	@Cacheable(value="city", key="#cityId", unless = "#result == null")
	public String getCityNameByCityId(String cityId) {
		MstCity mstCity = mstCityRepository.findByCityId(Long.valueOf(cityId));
		if(null == mstCity) {
			return null;
		}
		return mstCity.getCityName();
	}
	
	@Override
	@CachePut(value="city", key="#cityId", unless = "#result == null")
	public String updateCityNameByCityId(String cityId, String cityName) {
		MstCity mstCity = mstCityRepository.findByCityId(Long.valueOf(cityId));
		mstCity.setCityName(cityName);
		mstCityRepository.save(mstCity);
		return mstCity.getCityName();
	}
	
	@Override
	@CacheEvict(value="city", allEntries=true)
	public void cleanCityCache() {
		
	}
}
