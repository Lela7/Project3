package Sablon.Test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Sablon.Test.model.Drzava;
import Sablon.Test.repository.DrzavaRepository;
import Sablon.Test.service.DrzavaService;

@Service
public class JpaDrzavaService implements DrzavaService{
	@Autowired
	private DrzavaRepository drzavaRepository;
	
	@Override
	public Drzava findOne(Long id) {
		return drzavaRepository.findOneById(id);
	}

	@Override
	public List<Drzava> findAll() {
		return drzavaRepository.findAll();
	}

}
