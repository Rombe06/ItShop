package com.example.diagram_projekt.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vopros;
    @OneToOne(mappedBy = "question", cascade = CascadeType.ALL)
    private Product product;
    @OneToOne(mappedBy = "question", cascade = CascadeType.ALL)
    private Answer answer;
}
