package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.User;

// Spring.jpa já tem uma implementação padrão para essa interface
public interface UserRepository extends JpaRepository<User, Long> {

}
