package com.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.redis.service.CityService;

@RestController
public class CityController {
	
	@Autowired
	private CityService cityService;

	@GetMapping(value="getCityName")
	public ResponseEntity<String> getCityNameByCityId(@RequestParam("cityId") String cityId){
		return new ResponseEntity<>(cityService.getCityNameByCityId(cityId),HttpStatus.OK);
	}
	
	@GetMapping(value="updateCityDtls")
	public ResponseEntity<String> updateCityDtls(@RequestParam("cityId") String cityId, @RequestParam("cityName") String cityName){
		return new ResponseEntity<>(cityService.updateCityNameByCityId(cityId, cityName), HttpStatus.OK);
	}
	
	@GetMapping(value="clearCityCache")
	public ResponseEntity<String> clearCityCache(){
		cityService.cleanCityCache();
		return new ResponseEntity<>("SUCCESS",HttpStatus.OK);
	}
}
