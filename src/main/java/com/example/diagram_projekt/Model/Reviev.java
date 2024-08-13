package com.example.diagram_projekt.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviev {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String otziv;
    @OneToOne(mappedBy = "reviev", cascade = CascadeType.ALL)
    private Product product;
}
