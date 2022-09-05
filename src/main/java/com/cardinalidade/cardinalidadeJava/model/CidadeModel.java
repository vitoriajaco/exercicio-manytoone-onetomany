package com.cardinalidade.cardinalidadeJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "cidade")
public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "cidade")
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "estados_id", referencedColumnName = "codigo")
    private EstadoModel estadoModel;

}
