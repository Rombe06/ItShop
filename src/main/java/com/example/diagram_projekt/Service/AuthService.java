package com.example.diagram_projekt.Service;


import com.example.diagram_projekt.Model.User;
import com.example.diagram_projekt.Model.enums.Role;
import com.example.diagram_projekt.Repasytory.UserRepository;
import com.example.diagram_projekt.config.JwtUtils;
import com.example.diagram_projekt.dto.request.AuthRequest;
import com.example.diagram_projekt.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;
    private final PasswordEncoder passwordEncoder;

    public UserResponse save(String name, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(password));
        if (userRepository.existsByEmail(email)) {
            throw new RuntimeException("user exists email");
        }
        return map(userRepository.save(user));
    }

    public UserResponse login(String email,String password) {
        User user = userRepository.findByEmail(email).get();
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("invalid password");
        }
        return map(user);
    }

    private UserResponse map(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .role(user.getRole())
                .name(user.getName())
                .email(user.getEmail())
                .jwtToken(jwtUtils.generateToken(user.getEmail()))
                .build();
    }
}