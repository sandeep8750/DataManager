package com.sandeep.ContactManger.repositories;

import com.sandeep.ContactManger.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserEntity, String> {
	

    boolean existsByEmail(String email);

    Optional<UserEntity> findByEmail(String email);
}
