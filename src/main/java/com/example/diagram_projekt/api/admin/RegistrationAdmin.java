package com.example.diagram_projekt.api.admin;

import com.example.diagram_projekt.Service.RegistrationService;
import com.example.diagram_projekt.dto.response.RegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Registration/admin")
//@PreAuthorize("hasAnyRole('ADMIN')")
public class RegistrationAdmin {
    private final RegistrationService registrationService;


    @PostMapping("save")
    public RegistrationResponse save(
            @RequestParam String lastname,
            @RequestParam String firstname,
            @RequestParam String services,
            @RequestParam String  oblast,
            @RequestParam String phonenumber
    ){return registrationService.save(lastname, firstname, services,oblast,phonenumber);}

    @PutMapping("update")
    public RegistrationResponse update( @RequestParam String lastname,
                                        @RequestParam String firstname,
                                        @RequestParam String services,
                                        @RequestParam String  oblast,
                                        @RequestParam String phonenumber) {
        return registrationService.update(lastname, firstname, services,oblast,phonenumber);
    }
    @GetMapping("findBy/{id}")
    public RegistrationResponse findByID(@PathVariable Long id){
        return registrationService.findById(id);
    }
    @GetMapping("findAll")
    public List<RegistrationResponse> findAll(){
        return registrationService.findAll();
    }
    @DeleteMapping("deleteBy/{id}")
    public String deleteByID(@PathVariable Long id){
        return registrationService.deleteById(id);
    }
}
