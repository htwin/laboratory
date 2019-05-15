package com.laboManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboManager.mapper.TbApplyMapper;
import com.laboManager.pojo.TbApply;
import com.laboManager.service.ApplyService;

@Service
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private TbApplyMapper applyMapper;
	
	public void saveApply(TbApply apply) {
		applyMapper.insertSelective(apply);
	}

}
