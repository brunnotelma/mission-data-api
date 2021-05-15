package com.brunnotelma.missiondata.repository;

import com.brunnotelma.missiondata.model.SystemUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<SystemUser, Long> {

    SystemUser findUserByEmail(String email);
}