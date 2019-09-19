package com.ideaas.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Producto {

    @Id
    @Column(name = "idProducto")
    private Long id;

    @Transient
    private String descripcion;

    public Producto() {
    }
}
