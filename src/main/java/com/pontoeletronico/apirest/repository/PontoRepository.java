package com.pontoeletronico.apirest.repository;

import com.pontoeletronico.apirest.models.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PontoRepository extends JpaRepository<Ponto, String> {
    Ponto findById(long id);
    List<Ponto> findByNome(String nome);
}
