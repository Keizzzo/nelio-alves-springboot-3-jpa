package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//Long = Tipo do id do banco de dados
public interface CategoryRepository extends JpaRepository<Category, Long> {

    //EXEMPLOS de chamada de método
    //userRepository.saveAll(Arrays.asList(keizo, jabiraca));

}
