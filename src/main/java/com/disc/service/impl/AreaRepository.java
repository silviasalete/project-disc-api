package com.disc.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disc.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {

}
