package com.example.demo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.Assert.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AlunoRepositoryTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AlunoService alunoService;

    @Test
    public void deveriaRetornarUmAlunoBuscandoPeloNome() {
        String nome = "Rafael";
        Aluno aluno = alunoRepository.findAllByNome(nome);
        assertTrue("Aluno não foi encontrado", aluno.getNome().equals(nome));

    }



}
