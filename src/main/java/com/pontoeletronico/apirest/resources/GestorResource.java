package com.pontoeletronico.apirest.resources;

import com.pontoeletronico.apirest.models.Gestor;
import com.pontoeletronico.apirest.repository.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api/gestao")
public class GestorResource {
    @Autowired
    GestorRepository gestorRepository;

    // Listagem
    // http://localhost:8080/api/gestao/usuario
    @GetMapping("/usuario")
    public List<Gestor> listaUsuarios(){
        return gestorRepository.findAll();
    }

    // Consulta por id
    // http://localhost:8080/api/gestao/usuario/2
    @GetMapping("/usuario/{id}")
    public Gestor listaUsuarioUnico(@PathVariable(value = "id") long id){
        return gestorRepository.findById(id);
    }

    // Consulta por nome
    // http://localhost:8080/api/gestao/usuario/nome/arthur
    @GetMapping("/usuario/nome/{nome}")
    public List<Gestor> listaUsuarioNome(@PathVariable(value = "nome") String nome){
        return (List<Gestor>) gestorRepository.findByNome(nome);
    }

    //criaçao usuario
    /*
        URL
            http://localhost:8080/api/gestao/usuario
        headers
            Content-Type = application/json
        body
            {
                "nome": "arthur",
                "cpf": "2202001115",
                "email":"art@gmil.com",
                "data_cadastro": "20/03/2020"
            }
    */
    @PostMapping("/usuario")
    public Gestor salvaGestor(@RequestBody @Valid Gestor gestor) {
        return gestorRepository.save(gestor);
    }

    // edicao usuario
    /*
        URL
            http://localhost:8080/api/gestao/usuario
        headers
            Content-Type = application/json
        body
            {
                "id": 3,
                "nome": "arthur",
                "cpf": "2202001115",
                "email":"art@gmil.com",
                "data_cadastro": "20/03/2020"
            }
    */
    @PutMapping("/usuario")
    public Gestor atualizaUsuario(@RequestBody @Valid Gestor gestor) {
        return gestorRepository.save(gestor);
    }
}

