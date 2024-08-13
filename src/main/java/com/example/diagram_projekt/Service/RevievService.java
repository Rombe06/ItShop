package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Image;
import com.example.diagram_projekt.Model.Question;
import com.example.diagram_projekt.Model.Reviev;
import com.example.diagram_projekt.Repasytory.RevievRepository;
import com.example.diagram_projekt.dto.response.ImageResponse;
import com.example.diagram_projekt.dto.response.QuestionResponse;
import com.example.diagram_projekt.dto.response.RevievResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RevievService {
    private final RevievRepository revievRepository;

    public RevievResponse save(String otziv){
        Reviev reviev = new Reviev();
        reviev.setOtziv(otziv);
        return map(revievRepository.save(reviev));
    }

    public RevievResponse findById(Long id){
        return map(revievRepository.findById(id).orElseThrow());
    }

    public List<RevievResponse> findAll() {
        List<RevievResponse> list = new ArrayList<>();
        revievRepository.findAll().forEach(
                a -> {
                    list.add(map(a));
                }
        );
        return list;
    }



    public String deleteById(Long id) {
        revievRepository.deleteById(id);
        return "deleted";
    }

    private RevievResponse map(Reviev reviev){
        return RevievResponse.builder()
                .id(reviev.getId())
                .otziv(reviev.getOtziv()).build();
    }
}
