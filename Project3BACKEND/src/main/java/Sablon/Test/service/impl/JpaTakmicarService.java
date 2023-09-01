package Sablon.Test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import Sablon.Test.model.Takmicar;
import Sablon.Test.repository.TakmicarRepository;
import Sablon.Test.service.TakmicarService;

@Service
public class JpaTakmicarService implements TakmicarService{
	
	@Autowired
	private TakmicarRepository takmicarRepository;
	
	@Override
	public Takmicar findOne(Long id) {
		return takmicarRepository.findOneById(id);
	}

	@Override
	public Page<Takmicar> findAll(Integer pageNo) {
		return takmicarRepository.findAll(PageRequest.of(pageNo, 2));
	}

	@Override
	public Takmicar save(Takmicar takmicar) {
		return takmicarRepository.save(takmicar);
	}

	@Override
	public Takmicar update(Takmicar takmicar) {
		return takmicarRepository.save(takmicar);
	}

	@Override
	public Takmicar delete(Long id) {
		Takmicar takmicar =findOne(id);
		if(takmicar != null) {
			takmicar.getPrijave().remove(takmicar);
			takmicarRepository.delete(takmicar);
			return takmicar;
		}
		return null;
	}

	@Override
	public Page<Takmicar> find(String drzava, Integer brojMedaljaMin, Integer brojMedaljaMax, Integer pageNo) {
		if (drzava == null) {
			drzava="";
		}
		if ((brojMedaljaMin== null) || (brojMedaljaMax==null)) {
			return takmicarRepository.findByDrzavaIgnoreCaseContains(drzava,  PageRequest.of(pageNo, 2));
		}
		
		return takmicarRepository.findByDrzavaIgnoreCaseContainsAndBrojMedaljaGreaterThanAndBrojMedaljaLessThan(drzava, brojMedaljaMin, brojMedaljaMax, PageRequest.of(pageNo, 2));
	}

}
