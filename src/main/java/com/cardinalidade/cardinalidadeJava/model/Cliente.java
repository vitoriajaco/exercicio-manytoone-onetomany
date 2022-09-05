package com.cardinalidade.cardinalidadeJava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    //OneToMany Essa classe terá uma unica reclação enquanto a outra terá varias.
    //Cascade e para se excluir cliente o endereço seja excuido
    @JsonIgnore //Para evitar a recursividade de buscas
    @OneToMany(mappedBy = "cliente", cascade=CascadeType.ALL)//Varios endereços um cliente
    private List<Endereco> enderecos;
}
