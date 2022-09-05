package com.cardinalidade.cardinalidadeJava.service;

import com.cardinalidade.cardinalidadeJava.model.CidadeModel;
import com.cardinalidade.cardinalidadeJava.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeModel> buscarTodos(){
        return cidadeRepository.findAll();
    }

    public Optional<CidadeModel> buscarId(Long codigo){
        return cidadeRepository.findById(codigo);
    }

    public CidadeModel cadastar(CidadeModel cidadeModel){
        return cidadeRepository.save(cidadeModel);

    }

    public CidadeModel alterar (CidadeModel cidadeModel){
        cidadeModel.getCodigo();
        cidadeModel.getCidade();

        return cidadeRepository.save(cidadeModel);
    }

    public void deletar (Long codigo){
        cidadeRepository.deleteById(codigo);
    }
}
