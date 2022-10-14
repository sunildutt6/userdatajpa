package com.sunil.userdatajpaproject.service;

import java.util.List;

import com.sunil.userdatajpaproject.entities.User;

public interface UserService {

	public User saveUser(User user);

	public User updateUser(User user);

	public void deleteUser(User user);

	public User findUserById(int id);

	public List<User> findAllUsers();

}
