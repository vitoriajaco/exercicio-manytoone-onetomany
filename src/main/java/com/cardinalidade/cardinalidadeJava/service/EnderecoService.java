package com.cardinalidade.cardinalidadeJava.service;

import com.cardinalidade.cardinalidadeJava.model.Endereco;
import com.cardinalidade.cardinalidadeJava.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> buscarTodos(){
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> buscarId(Integer codigo){
        return enderecoRepository.findById(codigo);
    }

    public Endereco cadastrar(Endereco endereco){
       endereco.getCodigo();
       endereco.getLogradouro();
       endereco.getCliente();
        return enderecoRepository.save(endereco);
    }

    public Endereco alterar(Endereco endereco){
        endereco.getCodigo();
        endereco.getLogradouro();
        endereco.getCliente();

        return enderecoRepository.save(endereco);
    }

    public void deletar(Integer codigo){
        enderecoRepository.deleteById(codigo);
    }
}
