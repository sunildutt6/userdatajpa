package com.sunil.userdatajpaproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.userdatajpaproject.entities.User;
import com.sunil.userdatajpaproject.exception.handlerException;
import com.sunil.userdatajpaproject.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		return repository.findAll();
	}

	@Override
	public void deleteUser(User user) {
		repository.delete(user);
	}

	@Override
	public User findUserById(int id) {
		Optional<User> userById = repository.findById(id);
		if(userById.isEmpty()) throw new handlerException();
		return repository.findById(id).get();
	}

}
