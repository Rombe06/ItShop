package com.example.diagram_projekt.api.admin;

import com.example.diagram_projekt.Service.GreatingService;
import com.example.diagram_projekt.Service.ImageService;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.ImageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Greating/admin")
//@PreAuthorize("hasAnyRole('ADMIN')")
public class GreatingAdmin {

    private final GreatingService greatingService;

    @PutMapping("/update/{welcome}")
    public GreatingResponse update(@PathVariable("welcome") String welcome) {
        return greatingService.update(welcome);
    }

    @GetMapping("findAll")
    public GreatingResponse findAll() {
        return greatingService.findAll();
    }

}
