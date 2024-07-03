package com.example.diagram_projekt.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameprodukt;
    private String opisaniye;
    private String image;
    private int price;
    private String nalichii;
    @OneToOne
    @JoinColumn(name = "riviev_id")
    private Reviev reviev;
    @OneToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
