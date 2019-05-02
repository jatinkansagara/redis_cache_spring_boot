package com.redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.redis.model.MstCity;

public interface MstCityRepository extends JpaRepository<MstCity, Long> {

	MstCity findByCityId(@Param("cityId") Long cityId);
	
}
