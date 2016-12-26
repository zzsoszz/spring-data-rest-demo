package com.qingtian.data.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.qingtian.data.rest.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	@RestResource(path = "usernameStartsWith", rel = "nameStartsWith")
	public Page findByusernameStartsWith(@Param("username") String username, Pageable p);
}