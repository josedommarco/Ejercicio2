
package com.example.SpringHello.repositories;

import com.example.SpringHello.models.Alumno;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    List<Alumno> findAll();
    Optional<Alumno> findById(int id);
}
