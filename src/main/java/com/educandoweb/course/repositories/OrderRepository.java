package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Long = Tipo do id do banco de dados
//@Repository nao precisa por que está herdando do JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long> {

    //EXEMPLOS de chamada de método
    //userRepository.saveAll(Arrays.asList(keizo, jabiraca));

}
