package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.GreatingService;
import com.example.diagram_projekt.Service.PhonenumberService;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.PhonenumberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/PhoneNumber/user")
public class PhonenumberUser {
    private final PhonenumberService phonenumberService;

    @GetMapping("find")
    public PhonenumberResponse findAll(){
        return phonenumberService.findAll();
    }
}
