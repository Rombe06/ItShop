package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Product;
import com.example.diagram_projekt.Repasytory.ProductRepository;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponse save(
            String nameProduct,
            String description,
            String image,
            int price,
            boolean availability) {
        Product product = new Product();
        product.setNameProduct(nameProduct);
        product.setDescription(description);
        product.setPrice(price);
        product.setImage(image);
        product.setAvailability(availability);
        return map(productRepository.save(product));

    }

    public ProductResponse findById(Long id) {
        return map(productRepository.findById(id).orElseThrow());
    }

    public List<ProductResponse> findAll() {
        List<ProductResponse> list = new ArrayList<>();
        productRepository.findAll().forEach(
                a -> {
                    list.add(map(a));
                }
        );
        return list;
    }

    public String deleteById(Long id) {
        productRepository.deleteById(id);
        return "deleted";
    }


    private ProductResponse map(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .nameProduct(product.getNameProduct())
                .opisaniye(product.getDescription())
                .price(product.getPrice())
                .image(product.getImage())
                .nalichii(product.isAvailability()).build();

    }
}

















