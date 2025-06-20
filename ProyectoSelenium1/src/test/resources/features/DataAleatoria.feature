Feature: Data Aleatoria

  Background: Precondición para todos los escenarios
    Given Genero un par de numeros int aleatorios positivos

  @regression @smoke

  Scenario: Suma positiva
    When Sumo los valores
    Then Verifico que la suma sea positiva

  @regression

  Scenario: Producto positivo
    When Multiplico los valores
    Then Verifico que el producto sea positivo

  @regression @smoke

  Scenario: Raiz cuadrada positiva
    When Calcular la raiz cuadrada de cada uno de los números
    Then Verifico que ambos resultados sean positivos