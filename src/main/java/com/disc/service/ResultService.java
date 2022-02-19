package com.disc.service;

import java.util.List;

import com.disc.model.Result;

public interface ResultService {

	Result save(Result result);

	List<Result> list();
}
