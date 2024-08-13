package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.ImageService;
import com.example.diagram_projekt.Service.RevievService;
import com.example.diagram_projekt.dto.response.ImageResponse;
import com.example.diagram_projekt.dto.response.RevievResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Reviev/user")
public class RevievUser {

    private final RevievService revievService;

    @PostMapping("/save/{otziv}")
    public RevievResponse save(@PathVariable("otziv") String otziv){
        return revievService.save(otziv);
    }

    @GetMapping("findAll")
    public List<RevievResponse> findAll(){
        return revievService.findAll();
    }
}
