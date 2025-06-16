package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modelos.Monstruo;
import org.junit.jupiter.api.Assertions;
import reader.ExcelReader;

import java.util.List;

public class LecturaExcelStepDefinition {

    private List<Monstruo> listaMonstruo;
    private Monstruo monstruo;
    private int tamLista;

    @Given("Leo la lista de monstruos de Excel")
    public void leerListaExcel() {

        listaMonstruo = ExcelReader.obtenerListaMonstruo();

    }

    @When("Obtengo el primer elemento")
    public void obtenerPrimerElemento() {

        monstruo = listaMonstruo.getFirst();

    }

    @Then("Verifico que el nombre sea {string} y su edad sea {int}")
    public void verificarNombreYEdad(String nombre, int edad) {

        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruo.getNombre(), nombre),
                () -> Assertions.assertEquals(monstruo.getEdad(), edad)
        );

    }

    @When("Obtengo el último elemento")
    public void obtenerUltimoElemento() {

        monstruo = listaMonstruo.getLast();

    }

    @Then("Verifico que sea de género {string} y de tipo {string}")
    public void verificarGeneroYTipo(String genero, String tipo) {

        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruo.getGenero(), genero),
                () -> Assertions.assertEquals(monstruo.getTipo(), tipo)
        );
    }

    @When("Obtengo el tamaño de la lista")
    public void obtenerLongitudLista() {

        tamLista = listaMonstruo.size();

    }

    @Then("Verifico que su tamaño sea {int}")
    public void verificarLongitudLista(int longitud) {

        Assertions.assertEquals(tamLista, longitud);

    }

    @When("Obtengo el elemento con el index {int}")
    public void obtenerElementoIndex(int index) {

        monstruo = listaMonstruo.get(index);
        
    }

    @Then("Verifico que tenga el nombre {string}, edad {int} y peso {double}")
    public void verificarDatosMonstruo(String nombre, int edad, double peso) {

        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruo.getNombre(), nombre),
                () -> Assertions.assertEquals(monstruo.getEdad(), edad),
                () -> Assertions.assertEquals(monstruo.getPeso(), peso)
        );

    }
}