package org.serratec.backend.padaria.controller;

import java.util.List;

import org.serratec.backend.padaria.model.Cliente;
import org.serratec.backend.padaria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/padaria/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listarProdutos(){
		return new ResponseEntity<List<Cliente>>(service.obterClientes(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getById(Long id){
		return new ResponseEntity<Cliente>(service.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> adicionarProduto(@RequestBody Cliente cliente) {
		return new ResponseEntity<Cliente>(service.adicionar(cliente), HttpStatus.CREATED);
	}
}
