package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.ProductService;
import com.example.diagram_projekt.Service.RegistrationService;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import com.example.diagram_projekt.dto.response.RegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Registration/user")
public class RegistrationUser {
    private final RegistrationService registrationService;


    @GetMapping("findBy/{id}")
    public RegistrationResponse findByID(@PathVariable Long id){
        return registrationService.findById(id);
    }
    @GetMapping("findAll")
    public List<RegistrationResponse> findAll(){
        return registrationService.findAll();
    }
}
