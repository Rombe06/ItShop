package com.example.diagram_projekt.Model;

import com.example.diagram_projekt.Model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private String name;
    private String email;
    private String  password;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String code;
}
