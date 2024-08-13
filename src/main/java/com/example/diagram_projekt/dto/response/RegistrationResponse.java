package com.example.diagram_projekt.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationResponse {
    private Long id;

    private String lastname;
    private String firstname;
    private String services;
    private String oblast;
    private String phonenumber;
}
