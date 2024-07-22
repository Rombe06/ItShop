package com.example.diagram_projekt.api.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/PhoneNumber/admin")
@PreAuthorize("hasAnyRole('ADMIN')")
public class PhonenumberAdmin {

}
