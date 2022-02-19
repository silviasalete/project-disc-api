package com.disc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disc.model.Opcao;
import com.disc.service.OpcaoService;
import com.disc.web.dto.OpcaoDto;


@RestController
@RequestMapping("/opcao")
@CrossOrigin("*")
public class OpcaoController {

	@Autowired
	OpcaoService opcaoService;

	@GetMapping
	public List<Opcao> listAll() {
		return opcaoService.list();
	}

	@GetMapping("/{question}")
	public List<Opcao> findByQuestion(@PathVariable Integer question) {
		return opcaoService.findByQuestion(question);
	}
	@PostMapping("/save")
	public Opcao save(@RequestBody OpcaoDto opcaoDto) {
		
		return this.opcaoService.save(opcaoDto);
	}
}
