package com.example.SpringHello.controllers;

import com.example.SpringHello.models.Alumno;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.SpringHello.repositories.AlumnoRepository;


@RestController
@RequestMapping("/alumnado")
public class AlumnoController {

    @Autowired
    AlumnoRepository repo;

     @GetMapping("/alumnado")
    public List<Alumno> getAllAlumnos() {
        return repo.findAll();
    }

  
 @GetMapping("/{id}")
public ResponseEntity<Alumno> getAlumnoById(@PathVariable int id) {
    Optional<Alumno> optionalAlumno = repo.findById(id);
    if (optionalAlumno.isPresent()) {
        Alumno alumno = optionalAlumno.get();
        return new ResponseEntity<>(alumno, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}


        
}
