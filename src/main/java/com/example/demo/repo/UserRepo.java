package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
     
	
	@Query(nativeQuery = true, value="select * from users where username = :username")
	User findByUserName(String username);

}
