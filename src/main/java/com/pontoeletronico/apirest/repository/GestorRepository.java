package com.pontoeletronico.apirest.repository;

        import com.pontoeletronico.apirest.models.Gestor;
        import org.springframework.data.jpa.repository.JpaRepository;
        import java.util.List;

public interface GestorRepository extends JpaRepository<Gestor, String> {
    Gestor findById(long id);
    List<Gestor> findByNome(String nome);
}
