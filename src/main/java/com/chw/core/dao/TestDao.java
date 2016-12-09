package com.chw.core.dao;

import org.springframework.stereotype.Repository;

import com.chw.core.exception.BusinessException;
import com.chw.core.exception.ParameterException;

@Repository("testDao")
public class TestDao {

	public void exception(Integer id) throws Exception{
		switch(id){
		case 1:
			throw new BusinessException("12", "dao12");
		case 2:
			throw new BusinessException("22", "dao22");
		case 3:
			throw new BusinessException("33", "dao33");
		case 4:
			throw new BusinessException("44", "dao44");
		case 5:
			throw new BusinessException("55", "dao55");
		default:
			throw new ParameterException("Dao paramter erroe");
		}
	}
	
}
