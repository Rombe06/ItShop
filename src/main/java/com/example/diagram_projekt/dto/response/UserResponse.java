package com.example.diagram_projekt.dto.response;

import com.example.diagram_projekt.Model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String jwtToken;
    private Role role;
}