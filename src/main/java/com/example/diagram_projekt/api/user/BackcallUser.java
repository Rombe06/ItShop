package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.BackcallService;
import com.example.diagram_projekt.dto.response.BackcallResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
