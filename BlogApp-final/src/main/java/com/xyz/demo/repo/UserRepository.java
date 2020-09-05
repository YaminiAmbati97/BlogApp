package com.xyz.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.demo.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
