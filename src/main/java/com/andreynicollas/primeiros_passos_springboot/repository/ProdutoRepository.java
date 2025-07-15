package com.andreynicollas.primeiros_passos_springboot.repository;

import com.andreynicollas.primeiros_passos_springboot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
