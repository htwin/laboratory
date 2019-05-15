package com.laboManager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboManager.mapper.TbUserMapper;
import com.laboManager.pojo.TbUser;
import com.laboManager.pojo.TbUserExample;
import com.laboManager.pojo.TbUserExample.Criteria;
import com.laboManager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private TbUserMapper tbUserMapper;
	
	
	public TbUser findUserByUserName(String username) {
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TbUser> list = tbUserMapper.selectByExample(example);
		if(list!=null&&list.size()>0)return list.get(0);
		return null;
	}

}
