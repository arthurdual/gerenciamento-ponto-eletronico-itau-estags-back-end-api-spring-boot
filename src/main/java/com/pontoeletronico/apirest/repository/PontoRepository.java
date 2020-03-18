package com.pontoeletronico.apirest.repository;

import com.pontoeletronico.apirest.models.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
    Ponto findById(long id);
}