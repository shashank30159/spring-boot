package com.vm.rest.jpa.mysql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vm.rest.jpa.mysql.demo.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}