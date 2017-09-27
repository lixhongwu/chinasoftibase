package com.chinasofti.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chinasofti.springcloud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
