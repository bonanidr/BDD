package com.example.demo.integracao;

import com.example.demo.repository.Aluno;
import com.example.demo.repository.AlunoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class AlunoRepositoryTest {

    @Autowired
    AlunoRepository alunoRepository;

    @BeforeEach
    public void setup() {
        alunoRepository.save(retornarAluno());
    }

    private Aluno retornarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Bonani");
        return aluno;
    }

    @Test
    public void deveCarregarUmAllunoPeloNome() {
        Aluno usuarioCarregado = alunoRepository.findAllByNome("Bonani");
        Assertions.assertEquals(retornarAluno().getNome(), usuarioCarregado.getNome());
    }
}
