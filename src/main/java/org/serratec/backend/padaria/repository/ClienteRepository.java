package org.serratec.backend.padaria.repository;

import java.util.ArrayList;
import java.util.List;

import org.serratec.backend.padaria.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
	
	private ArrayList<Cliente> clientes = new ArrayList<>();
	
	private Long ultimoId = 0L;
	
	public List<Cliente> obterTodos(){
		return this.clientes;
	}
	
	public Cliente adicionar(Cliente cliente) {
		this.ultimoId = this.ultimoId + 1;
		cliente.setId(ultimoId);

		this.clientes.add(cliente);
		return cliente;
	}
	
	public Cliente findById(Long id) {
		for (Cliente cliente : clientes) {
			if(cliente.getId().equals(id)) {
				return cliente;
			}
		}
		return null;
	}
}
