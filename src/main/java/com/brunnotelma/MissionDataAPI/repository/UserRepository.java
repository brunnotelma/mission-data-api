package com.brunnotelma.MissionDataAPI.repository;

import com.brunnotelma.MissionDataAPI.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}