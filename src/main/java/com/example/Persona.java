package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Persona {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Genero genero;
    private double salario;

   

    


}
