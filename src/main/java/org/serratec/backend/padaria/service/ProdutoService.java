package org.serratec.backend.padaria.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.padaria.model.Produto;
import org.serratec.backend.padaria.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repository;
	
	public List<Produto> obterProdutos(){
		return repository.obterTodos();
	}
	
	public Produto adicionar(Produto produto) {
		return repository.adicionar(produto);
	}
	
	public Optional<Produto> getById(Long id) {
		return repository.findById(id);
	}
}
