package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Greating;
import com.example.diagram_projekt.Model.Image;
import com.example.diagram_projekt.Repasytory.GreatingRepository;
import com.example.diagram_projekt.Repasytory.ImageRepository;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.ImageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageResponse save(String image){
    Image image1 = new Image();
        image1.setImage(image);
        return map(imageRepository.save(image1));
    }

    public ImageResponse findById(Long id){
        return map(imageRepository.findById(id).orElseThrow());
    }

    public List<ImageResponse> findAll() {
        List<ImageResponse> list = new ArrayList<>();
        imageRepository.findAll().forEach(
                a -> {
                    list.add(map(a));
                }
        );
        return list;
    }



    public String deleteById(Long id) {
        imageRepository.deleteById(id);
        return "deleted";
    }



    private ImageResponse map(Image image){
        return ImageResponse.builder()
                .id(image.getId())
                .image(image.getImage()).build();
    }
}
