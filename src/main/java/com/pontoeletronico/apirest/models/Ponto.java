package com.pontoeletronico.apirest.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_PONTO")
public class Ponto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @NotNull
    private String nome;
    @CreationTimestamp
    private LocalDateTime data;
    @NotNull
    private String tipo;

    public Ponto() {
    }

    public Ponto(long id, @NotNull String nome, LocalDateTime data, @NotNull String tipo) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData() { return data; }

    public void setData(LocalDateTime data) { this.data = data; }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
