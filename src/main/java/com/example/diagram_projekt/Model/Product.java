package com.example.diagram_projekt.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProduct;
    private String description;
    private String image;
    private String  price;
    private boolean availability;
    @OneToOne
    @JoinColumn(name = "riviev_id")
    private Reviev reviev;
    @OneToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
