package fr.just_abdel.ourbusinessproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OurBusinessProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OurBusinessProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            System.out.println("Application démarrée. Accédez aux projets : http://localhost:8080/api/projects");
        };
    }

}
