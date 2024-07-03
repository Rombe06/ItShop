package com.example.diagram_projekt.dto.response;

import com.example.diagram_projekt.Model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthResponse {

    private String email;
    private String jwt;
    private Role role;
}