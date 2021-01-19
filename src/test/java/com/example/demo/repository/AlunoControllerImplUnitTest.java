package com.example.demo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringJUnitConfig
public class AlunoControllerImplUnitTest {

    @MockBean
    AlunoRepository repository;

    @Autowired
    AlunoService alunoController;

    BigDecimal valorPago = BigDecimal.TEN;

    @TestConfiguration
    static class AlunoServiceImplTestContextConfiguration {
        @Bean
        public AlunoService alunoService() {
            return new AlunoService();
        }
    }

    @Test
    public void testarCalculoAluno() {

        Aluno aluno = retornarAlunoMockado();
        when(repository.save(any(Aluno.class))).thenReturn(aluno);
        AlunoService alunoService = new AlunoService();


        alunoController.gravarAluno(aluno);
    }

    private Aluno retornarAlunoMockado() {
        Aluno aluno = new Aluno();
        aluno.setCodigo(1);
        aluno.setNome("Fulano");
        aluno.setValorPago(valorPago);
        return aluno;
    }


}
