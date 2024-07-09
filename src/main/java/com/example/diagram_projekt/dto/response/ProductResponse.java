package com.example.diagram_projekt.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private Long id;
    private String nameProduct;
    private String opisaniye;
    private String image;
    private int price;
    private boolean nalichii;
}
