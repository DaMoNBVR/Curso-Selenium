Feature: Lectura de Excel

  Background: Precondición para todos los escenarios
    Given Leo la lista de monstruos de Excel

  Scenario: Verificar el primer elemento
    When Obtengo el primer elemento
    Then Verifico que el nombre sea "TOLOSA" y su edad sea 5

  Scenario: Verificar el último elemento
    When Obtengo el último elemento
    Then Verifico que sea de género "MACHO" y de tipo "PLANTA"

  Scenario: Verificar la longitud de la lista
    When Obtengo el tamaño de la lista
    Then Verifico que su tamaño sea 14

  Scenario Outline: Verificar 4 primeros elementos
    When Obtengo el elemento con el index <index>
    Then Verifico que tenga el nombre <nombre>, edad <edad> y peso <peso>

    Examples:
    |index|  nombre   |edad|peso|
    |0    |"TOLOSA"   |5   |1.97|
    |1    |"COROMINAS"|1   |2.31|
    |2    |"ARNAIZ"   |5   |2.27|
    |3    |"CABEZAS"  |2   |2.05|
