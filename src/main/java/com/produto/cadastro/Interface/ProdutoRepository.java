package com.produto.cadastro.Interface;

import com.produto.cadastro.produtos.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
