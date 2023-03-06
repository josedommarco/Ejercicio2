package com.example.SpringHello.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "alumnado")
public class Alumno implements Serializable {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id")
    private Integer id;

     @Column(name = "nombre")
    private String nombre;

     @Column(name = "telefono")
    private String telefono;

     @Column(name = "email")
    private String email;

    @Column(name = "ad")
    private Double notaAD;

     @Column(name = "di")
    private Double notaDI;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getNotaAD() {
        return notaAD;
    }

    public void setNotaAD(Double notaAD) {
        this.notaAD = notaAD;
    }

    public Double getNotaDI() {
        return notaDI;
    }

    public void setNotaDI(Double notaDI) {
        this.notaDI = notaDI;
    }

    


}
