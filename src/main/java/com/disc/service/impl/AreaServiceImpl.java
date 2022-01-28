package com.disc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disc.model.Area;
import com.disc.service.AreaService;
@Service
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	AreaRepository areaRepository;

	@Override
	public Area save(String nomeArea) {
		Area area1 = new Area(nomeArea);
		return areaRepository.save(area1);
	}

}
