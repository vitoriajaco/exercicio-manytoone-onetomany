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
@Table(name = "enderecos")
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer codigo;

    private String logradouro;
    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName = "codigo")//Varios endereços um cliente
    private Cliente cliente;
}
