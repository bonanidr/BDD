package com.example.demo.resoucers;

import com.example.demo.repository.Aluno;
import com.example.demo.repository.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class AlunoRestController {

    @Autowired
    private AlunoService alunoService;

    @RequestMapping(value = "/aluno", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void notaFiscal(@RequestBody Aluno aluno) {
        alunoService.gravarAluno(aluno);
    }

    @RequestMapping(value = "/versao", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Integer retornarVersao() {
        Random random = new Random();
        return random.nextInt();
    }

    @RequestMapping(value = "/HelloWord", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String HelloWord() {
        return "Hello Word";
    }

}
