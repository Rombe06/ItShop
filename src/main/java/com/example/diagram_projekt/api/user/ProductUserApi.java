package com.example.diagram_projekt.api.user;

import com.example.diagram_projekt.Service.ProductService;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Produkct/user")
public class ProductUserApi {
    private final ProductService productService;


    @GetMapping("findBy/{id}")
    public ProductResponse findByID(@PathVariable Long id){
        return productService.findById(id);
    }
    @GetMapping("findAll")
    public List<ProductResponse> findAll(){
        return productService.findAll();
    }
}
