package com.example.diagram_projekt.Repasytory;

import com.example.diagram_projekt.Model.Reviev;
import com.example.diagram_projekt.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByCode(String code);

    boolean existsByEmail(String email);
}
