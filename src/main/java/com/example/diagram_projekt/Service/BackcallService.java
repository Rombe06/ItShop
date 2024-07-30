package com.example.diagram_projekt.Service;

import com.example.diagram_projekt.Model.Backcall;
import com.example.diagram_projekt.Repasytory.BackcallRepository;
import com.example.diagram_projekt.dto.response.BackcallResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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


    private BackcallResponse map(Backcall backcall){
        return BackcallResponse.builder()
                .id(backcall.getId())
                .name(backcall.getName())
                .number(backcall.getNumber())
                .oblast(backcall.getOblast()).build();
    }
}
