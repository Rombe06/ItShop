package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.QuestionService;
import com.example.diagram_projekt.dto.response.QuestionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Question/user")
public class QuestionUser {
    private final QuestionService questionService;
    @PostMapping("/save/{vopros}")
    public QuestionResponse save(@PathVariable("vopros") String vopros){
        return questionService.save(vopros);
    }
}
