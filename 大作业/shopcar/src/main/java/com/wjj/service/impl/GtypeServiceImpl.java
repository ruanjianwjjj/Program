package com.wjj.service.impl;

import com.wjj.entity.Gtype;
import com.wjj.service.GtypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wjj.dao.GtypeMapper;;

@Service
@Transactional  
public class GtypeServiceImpl implements GtypeService{
	@Autowired
	private GtypeMapper gtypeMapper=null;
	
	/*public void setGtypeMapper(GtypeMapper gtypeMapper) {
		this.gtypeMapper = gtypeMapper;
	}*/


	public void addGtype(Gtype gtype) {
		gtypeMapper.addGtype(gtype);
		
	}

	public void selectGtype(Gtype gtype) {
		// TODO Auto-generated method stub
		gtypeMapper.selectGtype(gtype);
	}
	
	
}
