package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "map_anunciantes")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class MapAnunciante {

    @Id
    @Column(name = "idAnunciante")
    private Long id;

    @Column(name = "Descripcion")
    private String descripcion;

    public MapAnunciante() {
    }
}
