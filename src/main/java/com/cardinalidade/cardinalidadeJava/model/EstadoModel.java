package com.cardinalidade.cardinalidadeJava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estado")

public class EstadoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "estado")
    private String estado;


    @JsonIgnore
    @OneToMany(mappedBy = "estado", cascade=CascadeType.ALL)
    private List<EstadoModel> estadoModels;

}

