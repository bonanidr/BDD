Feature: Gravar aluno.

  Scenario: Aluno aprovado vestibular
    Given Aluno realizando matricula
    When Aluno atingiu nota
    Then Libera Matricula

  Scenario: Aluno pagou boleto matricula
    Given Aluno realizando matricula
    When Boleto foi pago
    Then Libera Matricula

  Scenario: Baixa boleto Financeiro
    Given Aluno "Fulano" pagou 10.0
    And Aluno "Beltrano" pagou 20.0
    When Valor boleto 30.0
    Then Calcular correcao monetaria

  Scenario Outline: Aprovado vestibular
    When Nota da prova foi <valor>
    Then aluno foi aprovado
    Examples:
      | valor | 7

  Scenario: Propondo uma sequencia de alunos
    Given Dado dois alunos
      | nome   | cpf         |
      | Bonani | 31647725801 |
      | Davi   | 123456      |

  Scenario: cadastrar um aluno
    When Recebe novo aluno com dados validos
    Then efetiva cadastro

  Scenario: client makes call to GET /hello
    Given the client calls /hello
    When the client receives status code of 200
    Then the client receives server version hello
