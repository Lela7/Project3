package Sablon.Test.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Sablon.Test.model.Takmicar;

@Repository
public interface TakmicarRepository extends JpaRepository<Takmicar, Long>{
	Takmicar findOneById(Long id);
	
	Page<Takmicar> findByDrzavaIgnoreCaseContainsAndBrojMedaljaGreaterThanAndBrojMedaljaLessThan(String drzava, Integer brojMedaljaMin, Integer brojMedaljaMax, Pageable pageable);
	
	
	
}
