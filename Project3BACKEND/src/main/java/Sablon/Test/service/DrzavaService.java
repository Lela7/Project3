package Sablon.Test.service;

import java.util.List;

import Sablon.Test.model.Drzava;

public interface DrzavaService {
	
	Drzava findOne(Long id);
	
	List<Drzava> findAll();

}
