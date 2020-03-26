package com.pontoeletronico.apirest.models;

        import org.hibernate.annotations.CreationTimestamp;
        import org.hibernate.annotations.UpdateTimestamp;
        import javax.persistence.*;
        import javax.validation.constraints.NotNull;
        import java.io.Serializable;
        import java.time.LocalDateTime;

@Entity
@Table(name = "TB_GESTOR")
public class Gestor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @NotNull
    private String email;
    @Column(name = "data_cadastro", updatable = false)
    @CreationTimestamp
    private LocalDateTime data_cadastro;
    @UpdateTimestamp
    private LocalDateTime data_update_cadastro;

    public Gestor() {
    }

    public Gestor(long id, @NotNull String nome, @NotNull String cpf, @NotNull String email, LocalDateTime data_cadastro, LocalDateTime data_update_cadastro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.data_cadastro = data_cadastro;
        this.data_update_cadastro = data_update_cadastro;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getData_cadastro() { return data_cadastro; }

    public void setData_cadastro(LocalDateTime data_cadastro) { this.data_cadastro = data_cadastro; }

    public LocalDateTime getData_update_cadastro() {return data_update_cadastro; }

    public void setData_update_cadastro(LocalDateTime data_update_cadastro) { this.data_update_cadastro = data_update_cadastro;}
}
