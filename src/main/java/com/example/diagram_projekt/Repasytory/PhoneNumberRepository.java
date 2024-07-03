package com.example.diagram_projekt.Repasytory;

import com.example.diagram_projekt.Model.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
}
