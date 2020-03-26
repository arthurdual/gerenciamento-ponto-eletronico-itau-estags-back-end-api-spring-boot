package com.pontoeletronico.apirest.resources;

import com.pontoeletronico.apirest.models.Ponto;
import com.pontoeletronico.apirest.repository.PontoRepository;
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
public class PontoResourceTest {
    @Autowired
    private PontoRepository pontoRepository;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void listaPontosTest(){
        LocalDateTime time = LocalDateTime.now();
        Ponto ponto1 = new Ponto(1,"arthur", time,"entrada");
        Ponto ponto2 = new Ponto(2,"joao", time,"entrada");
        Ponto ponto3 = new Ponto(3,"antonieto", time,"entrada");
        this.pontoRepository.save(ponto1);
        this.pontoRepository.save(ponto2);
        this.pontoRepository.save(ponto3);
        List<Ponto> pontoList = pontoRepository.findAll();
        Assertions.assertThat(pontoList.size()).isEqualTo(3);
        Assertions.assertThat(pontoList.contains("arthur"));
        Assertions.assertThat(pontoList.contains("joao"));
        Assertions.assertThat(pontoList.contains("antonieto"));
    }
    @Test
    public void listaPontoUnicoTest(){
        LocalDateTime time = LocalDateTime.now();
        Ponto ponto1 = new Ponto(1,"arthur", time,"entrada");
        Ponto ponto2 = new Ponto(2,"joao", time,"entrada");
        this.pontoRepository.save(ponto1);
        this.pontoRepository.save(ponto2);
        Ponto pontoId1 = pontoRepository.findById(1);
        Assertions.assertThat(pontoId1.getId()).isEqualTo(1);
    }
    @Test
    public void listaPontoUsuarioTest(){
        LocalDateTime time = LocalDateTime.now();
        Ponto ponto1 = new Ponto(1,"arthur", time,"entrada");
        Ponto ponto2 = new Ponto(2,"arthur", time,"saida");
        Ponto ponto3 = new Ponto(3,"arthur", time,"entrada");
        Ponto ponto4 = new Ponto(4,"arthur", time,"saida");
        Ponto ponto5 = new Ponto(5,"joao", time,"entrada");
        this.pontoRepository.save(ponto1);
        this.pontoRepository.save(ponto2);
        this.pontoRepository.save(ponto3);
        this.pontoRepository.save(ponto4);
        this.pontoRepository.save(ponto5);
        List<Ponto> pontoList = pontoRepository.findByNome("arthur");
        Assertions.assertThat(pontoList.size()).isEqualTo(4);
    }
    @Test
    public void salvaPontoTest(){
        LocalDateTime time = LocalDateTime.now();
        Ponto ponto = new Ponto();
        ponto.setId(1);
        ponto.setNome("arthur");
        ponto.setTipo("entrada");
        ponto.setData(time);
        this.pontoRepository.save(ponto);
        Assertions.assertThat(ponto.getId()).isEqualTo(1);
        Assertions.assertThat(ponto.getNome()).isEqualTo("arthur");
        Assertions.assertThat(ponto.getData()).isEqualTo(time);
        Assertions.assertThat(ponto.getTipo()).isEqualTo("entrada");
    }
}

