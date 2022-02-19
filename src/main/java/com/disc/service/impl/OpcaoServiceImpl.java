package com.disc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disc.model.Area;
import com.disc.model.Opcao;
import com.disc.repository.AreaRepository;
import com.disc.repository.OpcaoRepository;
import com.disc.service.OpcaoService;
import com.disc.web.dto.OpcaoDto;
@Service
public class OpcaoServiceImpl implements OpcaoService {
	
	@Autowired
	OpcaoRepository opcaoRepository;
	
	@Autowired
	AreaRepository areaRepository;

	@SuppressWarnings("deprecation")
	@Override
	public Opcao save(OpcaoDto opcaoDto) {
		Area area = areaRepository.findById(new Long(opcaoDto.getArea())).get();
		Opcao opcao = new Opcao(opcaoDto.getId(),opcaoDto.getNome(),area);
		return opcaoRepository.save(opcao);
	}

	@Override
	public List<Opcao> list() {
		return opcaoRepository.findAll();
	}

	@Override
	public List<Opcao> findByQuestion(Integer question) {
		return opcaoRepository.findAllByQuestion(question);
	}
 

}
