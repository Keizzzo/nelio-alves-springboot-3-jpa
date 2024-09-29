package com.educandoweb.course.config;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test") //Mesmo nome que está no perfil do application.properties
public class TestConfig implements CommandLineRunner {

    //Injeção de Dependencia tem que ter acoplação fraca
    @Autowired     //resolve a dependencia e associa instancia do objeto dentro
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        //tudo que estiver aqui vai ser executado quando iniciar o app
        //Seeding = preencher banco de dados


        //id null = porque o banco de dados vai popular essa info
        User u1 = new User(null, "Keizo", "k@gmail.com", "92413986", "mortadela14");
        User u2 = new User(null, "Josiany", "jabi@gmail.com", "92413987", "mocotó24");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);


        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
