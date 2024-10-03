package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

//Long = Tipo do id do banco de dados
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    //EXEMPLOS de chamada de método
    //userRepository.saveAll(Arrays.asList(keizo, jabiraca));

}
