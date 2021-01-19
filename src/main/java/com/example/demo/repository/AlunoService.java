package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
@Transactional
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public void gravarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void criarAluno(String nomeAluno) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nomeAluno);
        alunoRepository.save(aluno1);
    }

    private void somaValores(Aluno aluno) {
        aluno.getValorPago().add(BigDecimal.TEN);
    }

    public void setAlunoRepository(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
}
