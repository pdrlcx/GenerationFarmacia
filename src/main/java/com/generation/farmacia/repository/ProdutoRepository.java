package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.farmacia.model.Produto;

/**@author Pedro 
 * @version v2 (Produto Repository) 
 * @since 25/01/2022 
 * */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
}
