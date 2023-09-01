package Sablon.Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Sablon.Test.model.Drzava;

@Repository
public interface DrzavaRepository extends JpaRepository<Drzava, Long>{

	Drzava findOneById(Long id);
}
