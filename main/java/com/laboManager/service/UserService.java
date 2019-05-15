package com.laboManager.service;

import com.laboManager.pojo.TbUser;

public interface UserService {
	public TbUser findUserByUserName(String username);
}
