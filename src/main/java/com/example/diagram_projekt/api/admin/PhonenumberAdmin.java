package com.example.diagram_projekt.api.admin;

import com.example.diagram_projekt.Service.PhonenumberService;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.PhonenumberResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/PhoneNumber/admin")
//@PreAuthorize("hasAnyRole('ADMIN')")
public class PhonenumberAdmin {

    private final PhonenumberService phonenumberService;

    @PutMapping("/update/{number}")
    public PhonenumberResponse update(@PathVariable("number") String  number) {
        return phonenumberService.update(number);
    }

//    @GetMapping("findBy/{id}")
//    public PhonenumberResponse findByID(@PathVariable Long id){
//        return phonenumberService.findById(id);
//    }


    @GetMapping("findAll")
    public PhonenumberResponse findAll() {
        return phonenumberService.findAll();
    }

}
