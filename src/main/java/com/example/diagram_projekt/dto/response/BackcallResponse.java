package com.example.diagram_projekt.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BackcallResponse {
    private Long id;
    private String name;
    private String  number;
    private String oblast;
}