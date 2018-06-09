package com.deepin.demo.redis.redisdemo5_lee;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


public abstract class AbstractService {

	protected static Map<String, String> repositoryBook = new HashMap<>();

	public AbstractService() {
		super();
	}

	@PostConstruct
	public void init() {
		repositoryBook.put("1", "name_1");
		repositoryBook.put("2", "name_2");
		repositoryBook.put("3", "name_3");
		repositoryBook.put("4", "name_4");

	}

}