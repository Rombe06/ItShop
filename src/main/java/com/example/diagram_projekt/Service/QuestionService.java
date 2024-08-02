package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Image;
import com.example.diagram_projekt.Model.Question;
import com.example.diagram_projekt.Repasytory.QuestionRepository;
import com.example.diagram_projekt.dto.response.ImageResponse;
import com.example.diagram_projekt.dto.response.QuestionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionResponse save(String vopros){
        Question question = new Question();
        question.setVopros(vopros);
        return map(questionRepository.save(question));
    }




    private QuestionResponse map(Question question){
        return QuestionResponse.builder()
                .id(question.getId())
                .vopros(question.getVopros()).build();
    }
}
