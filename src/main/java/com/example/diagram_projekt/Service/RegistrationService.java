package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Greating;
import com.example.diagram_projekt.Model.Product;
import com.example.diagram_projekt.Model.Registration;
import com.example.diagram_projekt.Repasytory.ProductRepository;
import com.example.diagram_projekt.Repasytory.RegistrationRepository;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.ProductResponse;
import com.example.diagram_projekt.dto.response.RegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    public RegistrationResponse save(
            String lastname,
            String firstname,
            String services,
            String  oblast,
            String phonenumber) {
        Registration registration = new Registration();
        registration.setLastname(lastname);
        registration.setFirstname(firstname);
        registration.setServices(services);
        registration.setOblast(oblast);
        registration.setPhonenumber(phonenumber);
        return map(registrationRepository.save(registration));

    }

    public RegistrationResponse update(String lastname,String firstname,String services,String oblast,String phonenumber) {
        Registration registration = registrationRepository.findById(1L).get();
        registration.setLastname(lastname);
        registration.setFirstname(firstname);
        registration.setServices(services);
        registration.setOblast(oblast);
        registration.setPhonenumber(phonenumber);
        return map(registrationRepository.save(registration));
    }

    public RegistrationResponse findById(Long id) {
        return map(registrationRepository.findById(id).orElseThrow());
    }

    public List<RegistrationResponse> findAll() {
        List<RegistrationResponse> list = new ArrayList<>();
        registrationRepository.findAll().forEach(
                a -> {
                    list.add(map(a));
                }
        );
        return list;
    }

    public String deleteById(Long id) {
        registrationRepository.deleteById(id);
        return "deleted";
    }


    private RegistrationResponse map(Registration registration) {
        return RegistrationResponse.builder()
                .id(registration.getId())
                .lastname(registration.getLastname())
                .firstname(registration.getFirstname())
                .services(registration.getServices())
                .oblast(registration.getOblast())
                .phonenumber(registration.getPhonenumber()).build();

    }
}
