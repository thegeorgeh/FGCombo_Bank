package com.qa.InProject.persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.InProject.persistence.Domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	

}
