package com.example.diagram_projekt.api.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Greating/admin")
@PreAuthorize("hasAnyRole('ADMIN')")
public class GreatingAdmin {
}
