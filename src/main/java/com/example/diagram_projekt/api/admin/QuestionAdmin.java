package com.example.diagram_projekt.api.admin;

import com.example.diagram_projekt.Service.QuestionService;
import com.example.diagram_projekt.dto.response.ImageResponse;
import com.example.diagram_projekt.dto.response.QuestionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Question/admin")
@PreAuthorize("hasAnyRole('ADMIN')")
public class QuestionAdmin {


}
