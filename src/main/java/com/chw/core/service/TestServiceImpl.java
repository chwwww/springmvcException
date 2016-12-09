package com.chw.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chw.core.dao.TestDao;
import com.chw.core.exception.BusinessException;
import com.chw.core.exception.ParameterException;

@Service
public class TestServiceImpl implements TestService{

	@Resource
	private TestDao testDao;
	
	@Override
	public void exception(Integer id) throws Exception {
		switch(id) {
		case 1:
			throw new BusinessException("11","service11");
		case 2:
			throw new BusinessException("22", "service22");
		case 3:
			throw new BusinessException("33", "service33");
		case 4:
			throw new BusinessException("44", "service44");
		case 5:
			throw new BusinessException("55", "service55");
		default:
			throw new ParameterException("Service Paramter Error");
		}
		
	}

	@Override
	public void dao(Integer id) throws Exception {
		testDao.exception(id);
		
	}

}
