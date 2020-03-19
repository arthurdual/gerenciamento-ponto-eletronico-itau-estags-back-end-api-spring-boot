package com.pontoeletronico.apirest.resources;

import com.pontoeletronico.apirest.models.Ponto;
import com.pontoeletronico.apirest.repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api/ponto")
public class PontoResource {
    @Autowired
    PontoRepository pontoRepository;

    //Listagem
    //http://localhost:8080/api/ponto
    @GetMapping()
    public List<Ponto> listaPontos(){
        return pontoRepository.findAll();
    }

    //Consulta por id
    //http://localhost:8080/api/ponto/2
    @GetMapping("/{id}")
    public Ponto listaPontoUnico(@PathVariable(value = "id") long id){
        return pontoRepository.findById(id);
    }

    //Consulta por nome
    // http://localhost:8080/api/ponto/usuario/arthur
     @GetMapping("/usuario/{nome}")
     public List<Ponto> listaPontoUsuario(@PathVariable(value = "nome") String nome){
         return (List<Ponto>) pontoRepository.findByNome(nome);
     }

    //criaçao batida de ponto
    /*
        URL
            http://localhost:8080/api/ponto
        headers
            Content-Type = application/json
        body
            {
                "nome": "arthur",
                "data": "20/03/2020",
                "tipo": "saida"
            }
    */
    @PostMapping()
    public Ponto salvaPonto(@RequestBody @Valid Ponto ponto) {
        return pontoRepository.save(ponto);
    }

}

