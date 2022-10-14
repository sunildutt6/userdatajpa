package com.sunil.userdatajpaproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil.userdatajpaproject.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
