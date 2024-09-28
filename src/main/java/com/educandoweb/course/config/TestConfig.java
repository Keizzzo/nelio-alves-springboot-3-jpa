package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") //Mesmo nome que está no perfil do application.properties
public class TestConfig implements CommandLineRunner {

    //Injeção de Dependencia tem que ter acoplação fraca
    @Autowired     //resolve a dependencia e associa instancia do objeto dentro
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        //tudo que estiver aqui vai ser executado quando iniciar o app
        //Seeding = preencher banco de dados


        //id null = porque o banco de dados vai popular essa info
        User keizo = new User(null, "Keizo", "k@gmail.com", "92413986", "mortadela14");
        User jabiraca = new User(null, "Josiany", "jabi@gmail.com", "92413987", "mocotó24");

        userRepository.saveAll(Arrays.asList(keizo, jabiraca));

    }
}
