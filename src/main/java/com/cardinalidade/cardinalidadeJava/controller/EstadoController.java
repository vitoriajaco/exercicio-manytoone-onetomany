package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.EstadoModel;
import com.cardinalidade.cardinalidadeJava.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(path = "/estados")
    public List<EstadoModel> buscarTodosEstados(){
        return estadoService.buscarTodos();
    }

    @GetMapping(path = "/estados/{codigo}")
    public Optional<EstadoModel> buscarporId(@PathVariable Long codigo){
      return  estadoService.buscarId(codigo);
    }

    @PutMapping (path = "/estados")
    public EstadoModel alterarEstado (@RequestBody EstadoModel estadoModel){
        return estadoService.alterar(estadoModel);
    }

    @DeleteMapping(path = "/estados/{codigo}")
    public void deletarEstado(@PathVariable Long codigo){
        estadoService.deletar(codigo);
    }
}
