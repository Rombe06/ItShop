package com.example.diagram_projekt.api.admin;

import com.example.diagram_projekt.Service.ProductService;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Produkt/admin")
@PreAuthorize("hasAnyRole('ADMIN')")
public class ProductAdmin {
    private final ProductService productService;
    @PostMapping("save")
    public ProductResponse save(
            @RequestParam String nameProduct,
            @RequestParam String description,
            @RequestParam String image,
            @RequestParam int price,
            @RequestParam boolean availability
    ){return productService.save(nameProduct, description,image,price,availability);}

    @GetMapping("findBy/{id}")
    public ProductResponse findByID(@PathVariable Long id){
        return productService.findById(id);
    }
    @GetMapping("findAll")
    public List<ProductResponse> findAll(){
        return productService.findAll();
    }
    @DeleteMapping("deleteBy/{id}")
    public String deleteByID(@PathVariable Long id){
        return productService.deleteById(id);
    }
}