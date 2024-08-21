package com.example.diagram_projekt;

import com.example.diagram_projekt.Model.Greating;
import com.example.diagram_projekt.Model.Phonenumber;
import com.example.diagram_projekt.Model.User;
import com.example.diagram_projekt.Model.enums.Role;
import com.example.diagram_projekt.Repasytory.GreatingRepository;
import com.example.diagram_projekt.Repasytory.PhonenumberRepository;
import com.example.diagram_projekt.Repasytory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class DiagramProjektApplication {
    private final GreatingRepository greatingRepository;
    private final PhonenumberRepository phonenumberRepository;
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DiagramProjektApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Greating greating = new Greating(1L, "Weelcome");
        greatingRepository.save(greating);

        Phonenumber phonenumber = new Phonenumber(1L, "73224");
        phonenumberRepository.save(phonenumber);

        User user = new User();
        user.setName("Admin");
        user.setPassword("123");
        user.setRole(Role.ADMIN);
        user.setEmail("Admin@email.com");
        userRepository.save(user);
    }
}