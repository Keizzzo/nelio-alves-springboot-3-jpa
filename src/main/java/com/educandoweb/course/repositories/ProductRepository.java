package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Long = Tipo do id do banco de dados
public interface ProductRepository extends JpaRepository<Product, Long> {

    //EXEMPLOS de chamada de método
    //userRepository.saveAll(Arrays.asList(keizo, jabiraca));

}
