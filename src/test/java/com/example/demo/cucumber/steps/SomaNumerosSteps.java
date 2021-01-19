package com.example.demo.cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.Assert.assertTrue;

public class SomaNumerosSteps {


    @When("somar numero {int} mais {int}")
    public void somar_numero_mais(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("resultado {int}")
    public void resultado(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }

    Integer soma = null;
    @When("subtrair numero {int} menos {int}")
    public void subtrair_numero_menos(Integer primeiroNumero, Integer segundoNumero) {
        // Write code here that turns the phrase above into concrete actions
        soma = primeiroNumero - segundoNumero;
    }


    @Then("resultado subtracao {int}")
    public void resultado_subtracao(Integer resultado) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue("Erro ao subtrair numero",soma.compareTo(resultado) != 0);
    }






}
