package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.GreatingService;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Greating/user")
public class GreatingUser {
    private final GreatingService greatingService;

    @GetMapping("find")
    public GreatingResponse findAll(){
        return greatingService.findAll();
    }
}
