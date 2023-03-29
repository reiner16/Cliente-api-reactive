package com.demo.Cliente.api.reactive.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
public class Cliente {

    private int id;
    private String nombre;
    private String apellidos;
    private String cedula;
    private String telefono;
    private String paisNacimiento;

}
