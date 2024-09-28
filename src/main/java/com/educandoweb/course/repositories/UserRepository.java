package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Long = Tipo do id do banco de dados
public interface UserRepository extends JpaRepository<User, Long> {

    //EXEMPLOS de chamada de método
    //userRepository.saveAll(Arrays.asList(keizo, jabiraca));

}
