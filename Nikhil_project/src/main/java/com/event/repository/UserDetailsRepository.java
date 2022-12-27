package com.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
