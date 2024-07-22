package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Image;
import com.example.diagram_projekt.Model.User;
import com.example.diagram_projekt.Repasytory.ImageRepository;
import com.example.diagram_projekt.Repasytory.UserRepository;
import com.example.diagram_projekt.dto.response.ImageResponse;
import com.example.diagram_projekt.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponse save(String name,
                             String email,
                             String password){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        return map(userRepository.save(user));
    }

    public UserResponse findById(Long id){
        return map(userRepository.findById(id).orElseThrow());
    }

    public List<UserResponse> findAll() {
        List<UserResponse> list = new ArrayList<>();
        userRepository.findAll().forEach(
                a -> {
                    list.add(map(a));
                }
        );
        return list;
    }



    public String deleteById(Long id) {
        userRepository.deleteById(id);
        return "deleted";
    }



    private UserResponse map(User user){
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}
