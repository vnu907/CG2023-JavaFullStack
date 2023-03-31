package com.capgemini.assignment2.user;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, String> {
	public Optional<Users> findById(String userName);

}
