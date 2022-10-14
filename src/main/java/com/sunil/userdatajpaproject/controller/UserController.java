package com.sunil.userdatajpaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunil.userdatajpaproject.entities.User;
import com.sunil.userdatajpaproject.exception.handlerException;
import com.sunil.userdatajpaproject.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("/showUser")
	public String showCreate() {
		return "displayUser";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		User saveUser = service.saveUser(user);
		String message = "User saved with Id: " + saveUser.getId();
		modelMap.addAttribute("message", message);
		return "displayUser";
	}

	@RequestMapping("/tableUser")
	public String displayAllUser(ModelMap modelMap) {
		List<User> allUsers = service.findAllUsers();
		modelMap.addAttribute("allUsers", allUsers);
		return "tableUser";
	}

	@RequestMapping("/editUser")
	public String findUser(@RequestParam("id") int id, ModelMap modelMap) {
		User user = service.findUserById(id);
		modelMap.addAttribute("user", user);
		return "editUser";
	}

	
}
