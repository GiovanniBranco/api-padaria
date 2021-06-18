package org.serratec.backend.padaria.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.serratec.backend.padaria.model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {
	
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	private Long ultimoId = 0L;
	
	public List<Produto> obterTodos(){
		return this.produtos;
	}
	
	public Produto adicionar(Produto produto) {
		this.ultimoId = this.ultimoId + 1;
		produto.setId(ultimoId);

		this.produtos.add(produto);
		return produto;
	}
	
	public Optional<Produto> findById(Long id) {
		for (Produto produto : produtos) {
			if(produto.getId().equals(id)) {
				return Optional.of(produto);
			}
		}
		return null;
	}
}
