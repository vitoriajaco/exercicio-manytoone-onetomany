package com.cardinalidade.cardinalidadeJava.service;


import com.cardinalidade.cardinalidadeJava.model.EstadoModel;
import com.cardinalidade.cardinalidadeJava.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<EstadoModel> buscarTodos(){
        return estadoRepository.findAll();
    }
    public Optional<EstadoModel> buscarId(Long codigo){
        return estadoRepository.findById(codigo);
    }
    public EstadoModel cadastrar (EstadoModel estadoModel){
        return estadoRepository.save(estadoModel);
    }
    public EstadoModel alterar (EstadoModel estadoModel){
        estadoModel.getCodigo();
        estadoModel.getEstado();
        return estadoRepository.save(estadoModel);
    }
    public void deletar (Long codigo){
        estadoRepository.deleteById(codigo);
    }


}