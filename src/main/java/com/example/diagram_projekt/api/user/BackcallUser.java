package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.BackcallService;
import com.example.diagram_projekt.dto.response.BackcallResponse;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import com.example.diagram_projekt.dto.response.RegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Backcall/user")
public class BackcallUser {
    private final BackcallService backcallService;

    @PostMapping("save")
    public BackcallResponse save(
            @RequestParam String name,
            @RequestParam String number,
            @RequestParam String oblast
    ){return backcallService.save(name, number,oblast);}

    public List<BackcallResponse> findAll(){
        return backcallService.findAll();
    }
}
