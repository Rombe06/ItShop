package com.example.diagram_projekt.api.admin;

import com.example.diagram_projekt.Service.ImageService;
import com.example.diagram_projekt.dto.response.ImageResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Image/admin")
//@PreAuthorize("hasAnyRole('ADMIN')")
public class ImageAdmin {
    private final ImageService imageService;
    @PostMapping("/save/{image}")
    public ImageResponse save(@PathVariable("image") String image){
        return imageService.save(image);
    }
    @GetMapping("findBy/{id}")
    public ImageResponse findByID(@PathVariable Long id){
        return imageService.findById(id);
    }
    @GetMapping("findAll")
    public List<ImageResponse> findAll(){
        return imageService.findAll();
    }
    @DeleteMapping("deleteBy/{id}")
    public String deleteByID(@PathVariable Long id){
        return imageService.deleteById(id);
    }

}
