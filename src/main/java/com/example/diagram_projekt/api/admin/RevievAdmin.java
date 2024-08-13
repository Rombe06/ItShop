package com.example.diagram_projekt.api.admin;

import com.example.diagram_projekt.Service.RevievService;
import com.example.diagram_projekt.dto.response.ImageResponse;
import com.example.diagram_projekt.dto.response.RevievResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Reviev/admin")
//@PreAuthorize("hasAnyRole('ADMIN')")
public class RevievAdmin {

    private final RevievService revievService;

    @GetMapping("findBy/{id}")
    public RevievResponse findByID(@PathVariable Long id){
        return revievService.findById(id);
    }
    @GetMapping("findAll")
    public List<RevievResponse> findAll(){
        return revievService.findAll();
    }
    @DeleteMapping("deleteBy/{id}")
    public String deleteByID(@PathVariable Long id){
        return revievService.deleteById(id);
    }

}
