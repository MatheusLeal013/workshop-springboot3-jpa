package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") // deve ser igual ao nome que está no profile do application.properties
public class TestConfig implements CommandLineRunner {

    @Autowired // Spring resolve a dependência e associar uma instância do UserRepository no TestConfig
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // id null pois vai ser gerado
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2)); // Passa uma lista e salva no banco de dados
    }
}
