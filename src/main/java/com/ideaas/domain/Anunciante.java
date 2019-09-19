package com.ideaas.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "anunciantes")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Anunciante {

    @Id
    @Column(name = "idAnunciante")
    private Long id;

    @Transient
    private String descripcion;

    public Anunciante() {
    }
}
