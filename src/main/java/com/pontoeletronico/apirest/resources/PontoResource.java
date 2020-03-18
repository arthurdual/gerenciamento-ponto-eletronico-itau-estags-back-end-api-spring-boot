package com.pontoeletronico.apirest.resources;


import com.pontoeletronico.apirest.models.Ponto;
import com.pontoeletronico.apirest.repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PontoResource {
    @Autowired
    PontoRepository pontoRepository;

    @GetMapping("/ponto")
    public List<Ponto> listaPontos(){
        return pontoRepository.findAll();
    }
    @GetMapping("/ponto/{id}")
    public Ponto listaPontoUnico(@PathVariable(value = "id") long id){
        return pontoRepository.findById(id);
    }

    @PostMapping("/ponto/{id}")
    public Ponto salvaPonto(@RequestBody @Valid Ponto ponto) {
        return pontoRepository.save(ponto);
    }

}
// SELECT * FROM TB_PONTO;
// INSERT INTO TB_PONTO (id, nome, data, tipo) VALUES (1,'arthur', '18/03/2020', 'entrada');
// INSERT INTO TB_PONTO (id, nome, data, tipo) VALUES (2,'arthur', '18/03/2020', 'saida');
// INSERT INTO TB_PONTO (id, nome, data, tipo) VALUES (3,'arthur', '19/03/2020', 'entrada');
// INSERT INTO TB_PONTO (id, nome, data, tipo) VALUES (4,'arthur', '19/03/2020', 'saida');
// INSERT INTO TB_PONTO (id, nome, data, tipo) VALUES (5,'arthur', '20/03/2020', 'entrada');
// INSERT INTO TB_PONTO (id, nome, data, tipo) VALUES (6,'arthur', '20/03/2020', 'saida');
