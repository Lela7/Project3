package Sablon.Test.service;

import org.springframework.data.domain.Page;

import Sablon.Test.model.Takmicar;

public interface TakmicarService {
	
	Takmicar findOne(Long id);
	
	Page <Takmicar> findAll(Integer pageNo);

	Takmicar save(Takmicar takmicar);
	
	Takmicar update(Takmicar takmicar);
	
	Takmicar delete(Long id);
	
	Page<Takmicar> find (String drzava, Integer brojMedaljaMin, Integer brojMedaljaMax, Integer pageNo);
}
