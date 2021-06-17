package org.serratec.backend.padaria.service;

import java.util.List;

import org.serratec.backend.padaria.model.Cliente;
import org.serratec.backend.padaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repository;
	
	public List<Cliente> obterClientes(){
		return repository.obterTodos();
	}
	
	public Cliente getById(Long id) {
		return repository.findById(id);
	}
	
	public Cliente adicionar(Cliente cliente) {
		return repository.adicionar(cliente);
	}
	
	
}
