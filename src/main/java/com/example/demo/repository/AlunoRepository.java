package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    Aluno findAlunoByCodigo(Integer codigo);
    Aluno findAllByNome(String nome);
}
