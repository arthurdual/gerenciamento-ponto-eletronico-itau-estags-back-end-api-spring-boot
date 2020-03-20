package com.pontoeletronico.apirest.resources;

import com.pontoeletronico.apirest.models.Ponto;
import com.pontoeletronico.apirest.repository.PontoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api")
@Api(value="APIREST PONTO")
@CrossOrigin(origins = "*")
public class PontoResource {
    @Autowired
    PontoRepository pontoRepository;

    @ApiOperation(value = "Retorna lista de pontos batidos")
    @GetMapping("/ponto")
    public List<Ponto> listaPontos(){
        return pontoRepository.findAll();
    }

    @ApiOperation(value = "Retorna Ponto por id")
    @GetMapping("/ponto/{id}")
    public Ponto listaPontoUnico(@PathVariable(value = "id") long id){
        return pontoRepository.findById(id);
    }

    @GetMapping("/ponto/usuario/{nome}")
    @ApiOperation(value = "Retorna ponto por nome de usuario")
    public List<Ponto> listaPontoUsuario(@PathVariable(value = "nome") String nome){
         return (List<Ponto>) pontoRepository.findByNome(nome);
     }

    @ApiOperation(value = "Cria a batida de ponto")
    @PostMapping("/ponto")
    public Ponto salvaPonto(@RequestBody @Valid Ponto ponto) {
        return pontoRepository.save(ponto);
    }
}

