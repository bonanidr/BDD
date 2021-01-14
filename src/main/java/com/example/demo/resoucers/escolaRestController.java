package com.example.demo.resoucers;

import com.example.demo.escola.Aluno;
import com.example.demo.escola.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class escolaRestController {

    @Autowired
    private AlunoService alunoService;

    @RequestMapping(value = "/aluno", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void notaFiscal(@RequestBody Aluno aluno) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Apaminondas Stulunca");
        alunoService.gravarAluno(aluno1);

    }

}
