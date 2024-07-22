package com.example.diagram_projekt;

import com.example.diagram_projekt.Model.Greating;
import com.example.diagram_projekt.Repasytory.GreatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class DiagramProjektApplication {
    private final GreatingRepository greatingRepository;

    public static void main(String[] args) {
        SpringApplication.run(DiagramProjektApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Greating greating = new Greating(1L, "Weelcome");
        greatingRepository.save(greating);
    }
}