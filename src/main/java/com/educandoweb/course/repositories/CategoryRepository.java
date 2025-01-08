package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring.jpa já tem uma implementação padrão para essa interface
/* @Repository - opicinonal colocar annotation, porque interface já herda do JPARepository,
que já registado como componente do spring */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
