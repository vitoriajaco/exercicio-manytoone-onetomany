package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.Cliente;
import com.cardinalidade.cardinalidadeJava.model.Endereco;
import com.cardinalidade.cardinalidadeJava.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(path = "/enderecos")
    public List<Endereco> buscarTodosClientes(){
        return enderecoService.buscarTodos();
    }

    @GetMapping(path = "/enderecos/{codigo}")
    public Optional<Endereco> buscarPorId(@PathVariable Integer codigo){
        return enderecoService.buscarId(codigo);
    }

    @PostMapping(path = "/enderecos")
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco cadastrarEndereco(@RequestBody Endereco endereco){
        return enderecoService.cadastrar(endereco);
    }

    @PutMapping(path = "/enderecos/{codigo}")
    public Endereco alterarEndereco(@RequestBody Endereco endereco){
        return enderecoService.alterar(endereco);
    }

    @DeleteMapping(path = "/enderecos/{codigo}")
    public void deletarEndereco(@PathVariable Integer codigo){
        enderecoService.deletar(codigo);
    }
}
