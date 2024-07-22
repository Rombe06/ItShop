package com.example.diagram_projekt.api;

import com.example.diagram_projekt.Model.User;
import com.example.diagram_projekt.Repasytory.UserRepository;
import com.example.diagram_projekt.Service.AuthService;
import com.example.diagram_projekt.dto.request.AuthRequest;
import com.example.diagram_projekt.dto.request.RequestForRegister;
import com.example.diagram_projekt.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserApi {
    private final AuthService authService;


    @PostMapping("save")
    public UserResponse save(@RequestParam String name,
                             @RequestParam String email,
                             @RequestParam String password) {
        return authService.save(name, email, password);
    }

    @PostMapping("login")
    public UserResponse save(@RequestParam String email, @RequestParam String password) {
        return authService.login(email, password);
    }


}
