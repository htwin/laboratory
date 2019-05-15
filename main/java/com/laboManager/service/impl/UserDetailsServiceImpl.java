package com.laboManager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.laboManager.pojo.TbUser;
import com.laboManager.service.UserService;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("经过了==========");
		List<GrantedAuthority> authorities = new ArrayList();

		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		TbUser user = userService.findUserByUserName(username);
		if(user!=null) {
			return new User(username, user.getPassword(), authorities);
		}
		
		return null;
	}
}
