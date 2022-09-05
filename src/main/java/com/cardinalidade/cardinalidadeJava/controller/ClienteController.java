package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.Cliente;
import com.cardinalidade.cardinalidadeJava.service.ClienteService;
import com.cardinalidade.cardinalidadeJava.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(path = "/clientes")
    public Iterable<Cliente> buscarTodosClientes(){
        return clienteService.buscarTodos();
    }

    @GetMapping(path = "/clientes/{codigo}")
    public Optional<Cliente> buscarPorId(@PathVariable Integer codigo){
        return clienteService.buscarId(codigo);
    }

    @PostMapping(path = "/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente(@RequestBody Cliente cliente){
        return clienteService.cadastrar(cliente);
    }

    @PutMapping(path = "/clientes/{codigo}")
    public Cliente alterarCliente(@RequestBody Cliente cliente){
        return clienteService.alterar(cliente);
    }

    @DeleteMapping(path = "/clientes/{codigo}")
    public void deletarCliente(@PathVariable Integer codigo){
        clienteService.deletar(codigo);
    }
}
