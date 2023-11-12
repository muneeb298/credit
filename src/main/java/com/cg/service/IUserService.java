package com.cg.service;

import java.util.List;

import com.cg.entity.User;

public interface IUserService {

	public String signIn(User user);
	public String signOut(User user);
	public String changePassword(User user);
	public List<User> getAllUsers();
}
