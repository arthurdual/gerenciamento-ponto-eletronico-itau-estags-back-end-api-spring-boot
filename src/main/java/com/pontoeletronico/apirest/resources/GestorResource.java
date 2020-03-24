package com.pontoeletronico.apirest.resources;

import com.pontoeletronico.apirest.models.Gestor;
import com.pontoeletronico.apirest.repository.GestorRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api/gestao")
@Api(value="APIREST GESTAO")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GestorResource {
    @Autowired
    GestorRepository gestorRepository;

    @ApiOperation(value = "Retorna Lista de usuario ")
    @GetMapping("/usuario")
    public List<Gestor> listaUsuarios(){
        return gestorRepository.findAll();
    }

    @ApiOperation(value = "Retorna usuario por id")
    @GetMapping("/usuario/{id}")
    public Gestor listaUsuarioUnico(@PathVariable(value = "id") long id){
        return gestorRepository.findById(id);
    }

    @ApiOperation(value = "Retorna usuario por nome")
    @GetMapping("/usuario/nome/{nome}")
    public List<Gestor> listaUsuarioNome(@PathVariable(value = "nome") String nome){
        return (List<Gestor>) gestorRepository.findByNome(nome);
    }

    @ApiOperation(value = "Cria um usuario")
    @PostMapping("/usuario")
    public Gestor salvaGestor(@RequestBody @Valid Gestor gestor) {
        return gestorRepository.save(gestor);
    }

    @ApiOperation(value = "Atualiza um usuario")
    @PutMapping("/usuario")
    public Gestor atualizaUsuario(@RequestBody @Valid Gestor gestor) {
        return gestorRepository.save(gestor);
    }
}

