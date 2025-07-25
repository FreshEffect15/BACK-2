package com.example.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDireccion extends Base {


    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Direccion direccion;
}
