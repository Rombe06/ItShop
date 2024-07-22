package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Greating;
import com.example.diagram_projekt.Model.Product;
import com.example.diagram_projekt.Repasytory.GreatingRepository;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GreatingService {
    private final GreatingRepository greatingRepository;

    //    public GreatingResponse save(String welcome){
//        Greating greating = new Greating();
//        greating.setWelcome(welcome);
//        return map(greatingRepository.save(greating));
//    }
    public GreatingResponse update(String welcome) {
        Greating greating = new Greating();
        greating.setWelcome(welcome);


        return map(greatingRepository.save(greating));
    }

    public GreatingResponse findById(Long id) {
        return map(greatingRepository.findById(id).orElseThrow());
    }

    public GreatingResponse findAll() {
        return map(greatingRepository.findAll().get(0));
    }


//
//    public String deleteById(Long id) {
//        greatingRepository.deleteById(id);
//        return "deleted";
//    }


    private GreatingResponse map(Greating greating) {
        return GreatingResponse.builder()
                .id(greating.getId())
                .welcome(greating.getWelcome()).build();
    }
}
