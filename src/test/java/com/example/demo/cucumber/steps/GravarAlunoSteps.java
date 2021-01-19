package com.example.demo.cucumber.steps;

import com.example.demo.repository.Aluno;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertTrue;

public class GravarAlunoSteps extends GravarAlunosStepsSpring{

    Aluno aluno = new Aluno();

    @Given("Aluno realizando matricula")
    public void aluno_realizando_matricula() {
    }

    @When("Aluno atingiu nota")
    public void aluno_atingiu_nota() {
    }

    @Then("Libera Matricula")
    public void libera_matricula() {
    }

    @When("Recebe novo aluno com dados validos")
    public void recebe_novo_aluno_com_dados_validos() {
        aluno.setNome("Rafael");
        aluno.setValorPago(new BigDecimal(1000));

    }

    @Then("efetiva cadastro")
    public void efetiva_cadastro() {
       alunoService.gravarAluno(aluno);
       assertTrue("Não foi possivel persistir o cadastro do aluno!",aluno.getCodigo() != null);

    }

    @Given("the client calls \\/hello")
    public void the_client_calls_hello() {
    }

    @When("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer codigoStatus) throws Exception {
       teste();
    }
    @Then("the client receives server version hello")
    public void the_client_receives_server_version_hello() {
    }

    @Given("Dado dois alunos")
    public void dado_dois_alunos(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> mapList = dataTable.asMaps();
        mapList.forEach(linhas -> System.out.println(linhas.values()));
    }

}
