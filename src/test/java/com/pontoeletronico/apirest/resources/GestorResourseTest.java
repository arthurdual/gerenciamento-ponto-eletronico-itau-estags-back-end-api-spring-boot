package com.pontoeletronico.apirest.resources;


import com.pontoeletronico.apirest.models.Gestor;
import com.pontoeletronico.apirest.repository.GestorRepository;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class GestorResourseTest {
    @Autowired
    private GestorRepository gestorRepository;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void listaUsuariosTest(){
        LocalDateTime time = LocalDateTime.now();
        Gestor usuario1 = new Gestor(1, "arthur", "33267230080", "ArthDut@mail.com", time, time);
        Gestor usuario2 = new Gestor(2, "tiago", "52460386028", "tiago@mail.com", time, time);
        Gestor usuario3 = new Gestor(3, "gabis", "31692201018", "gabis@mail.com", time, time);
        this.gestorRepository.save(usuario1);
        this.gestorRepository.save(usuario2);
        this.gestorRepository.save(usuario3);
        List<Gestor> usuarioList = gestorRepository.findAll();
        Assertions.assertThat(usuarioList.size()).isEqualTo(3);
        Assertions.assertThat(usuarioList.contains("arthur"));
        Assertions.assertThat(usuarioList.contains("tiago"));
        Assertions.assertThat(usuarioList.contains("gabis"));
    }
    @Test
    public void listaPontoUnicoTest() throws InterruptedException {
        LocalDateTime time = LocalDateTime.now();
        Gestor usuario1 = new Gestor(1, "arthur", "33267230080", "ArthDut@mail.com", time, time);
        Gestor usuario2 = new Gestor(2, "tiago", "52460386028", "tiago@mail.com", time, time);
        this.gestorRepository.save(usuario1);
        this.gestorRepository.save(usuario2);

        Gestor usuarioId1 = gestorRepository.findById(1);
        Assertions.assertThat(usuarioId1.getId()).isEqualTo(1);
        Assertions.assertThat(usuarioId1.getNome()).isEqualTo("arthur");
        Assertions.assertThat(usuarioId1.getCpf()).isEqualTo("33267230080");
        Assertions.assertThat(usuarioId1.getEmail()).isEqualTo("ArthDut@mail.com");
        Assertions.assertThat(usuarioId1.getData_cadastro()).isAfterOrEqualTo(time);
        Assertions.assertThat(usuarioId1.getData_update_cadastro()).isAfterOrEqualTo(time);
    }
    @Test
    public void listaPontoUsuarioTest(){
        LocalDateTime time = LocalDateTime.now();
        Gestor usuario1 = new Gestor(1, "arthur", "33267230080", "ArthDut@mail.com", time, time);
        Gestor usuario2 = new Gestor(2, "tiago", "85729419082", "tiago@mail.com", time, time);
        Gestor usuario3 = new Gestor(3, "alan", "77805522090", "alan@mail.com", time, time);
        Gestor usuario4 = new Gestor(4, "gabis", "49713444035", "gabis@mail.com", time, time);
        Gestor usuario5 = new Gestor(5, "setai", "45613814066", "setai@mail.com", time, time);
        this.gestorRepository.save(usuario1);
        this.gestorRepository.save(usuario2);
        this.gestorRepository.save(usuario3);
        this.gestorRepository.save(usuario4);
        this.gestorRepository.save(usuario5);
        List<Gestor> pontoList = gestorRepository.findByNome("arthur");
        Assertions.assertThat(pontoList.size()).isEqualTo(1);
    }
    @Test
    public void salvaPontoTest(){
        LocalDateTime time = LocalDateTime.now();
        Gestor usuario = new Gestor();
        usuario.setId(1);
        usuario.setNome("arthur");
        usuario.setEmail("ArthDut@mail.com");
        usuario.setCpf("33267230080");
        usuario.setData_cadastro(time);
        usuario.setData_cadastro(time);
        this.gestorRepository.save(usuario);
        Assertions.assertThat(usuario.getId()).isEqualTo(1);
    }
    @Test
    public void atualizaUsuarioTest(){
        LocalDateTime time = LocalDateTime.now();
        Gestor usuario = new Gestor();
        usuario.setId(1);
        usuario.setNome("arthur");
        usuario.setEmail("ArthDut@mail.com");
        usuario.setCpf("33267230080");
        usuario.setData_cadastro(time);
        usuario.setData_cadastro(time);

        LocalDateTime time2 = LocalDateTime.now();
        this.gestorRepository.save(usuario);
        usuario.setData_update_cadastro(time2);


        Assertions.assertThat(usuario.getId()).isEqualTo(1);
        Assertions.assertThat(usuario.getData_cadastro()).isEqualTo(time);
        Assertions.assertThat(usuario.getData_update_cadastro()).isEqualTo(time2);
    }
}