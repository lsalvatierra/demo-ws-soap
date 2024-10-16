package com.la.demo_ws_soap.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddomicilio;
    @Column(name = "descdomicilio")
    private String descdomicilio;
    @Column(name = "nrodomicilio")
    private Integer nrodomicilio;
    @Column(name = "refdomicilio")
    private String refdomicilio;
}
