package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Backcall;
import com.example.diagram_projekt.Repasytory.BackcallRepository;
import com.example.diagram_projekt.dto.response.BackcallResponse;
import com.example.diagram_projekt.dto.response.RegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BackcallService {
    private final BackcallRepository backcallRepository;

    public BackcallResponse save(
            String name,
            String  number,
            String oblast){
        Backcall backcall = new Backcall();
        backcall.setName(name);
        backcall.setNumber(number);
        backcall.setOblast(oblast);
        return map(backcallRepository.save(backcall));
    }

    public List<BackcallResponse> findAll() {
        List<BackcallResponse> list = new ArrayList<>();
        backcallRepository.findAll().forEach(
                a -> {
                    list.add(map(a));
                }
        );
        return list;
    }

    private BackcallResponse map(Backcall backcall){
        return BackcallResponse.builder()
                .id(backcall.getId())
                .name(backcall.getName())
                .number(backcall.getNumber())
                .oblast(backcall.getOblast()).build();
    }
}
