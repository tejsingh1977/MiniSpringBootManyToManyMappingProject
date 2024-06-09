package com.tcs.trs.repository;
import org.springframework.data.repository.CrudRepository;

import com.tcs.trs.entity.Services;

public interface ServicesRepository extends CrudRepository<Services, Integer> {
	
}