package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "medios")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class Medios {
    @Id
    @Column(name = "idmedio")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    public Medios() {
    }
}
