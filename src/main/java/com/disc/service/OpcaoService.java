package com.disc.service;

import java.util.List;

import com.disc.model.Opcao;
import com.disc.web.dto.OpcaoDto;

public interface OpcaoService {

	Opcao save(OpcaoDto opcaoDto);

	List<Opcao> list();
	
	List<Opcao> findByQuestion(Integer question);
}
