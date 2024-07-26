package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Greating;
import com.example.diagram_projekt.Model.Phonenumber;
import com.example.diagram_projekt.Repasytory.PhonenumberRepository;
import com.example.diagram_projekt.dto.response.GreatingResponse;
import com.example.diagram_projekt.dto.response.PhonenumberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PhonenumberService {
    private final PhonenumberRepository phonenumberRepository;

    public PhonenumberResponse update(String number) {
        Phonenumber phonenumber = phonenumberRepository.findById(1L).get();
        phonenumber.setNumber(number);
        return map(phonenumberRepository.save(phonenumber));
    }

    public PhonenumberResponse findById(Long id) {
        return map(phonenumberRepository.findById(id).orElseThrow());
    }

    public PhonenumberResponse findAll() {
        return map(phonenumberRepository.findAll().get(0));
    }
    private PhonenumberResponse map(Phonenumber phonenumber) {
        return PhonenumberResponse.builder()
                .id(phonenumber.getId())
                .number(phonenumber.getNumber()).build();
    }
}
