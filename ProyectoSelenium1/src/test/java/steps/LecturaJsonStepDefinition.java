package steps;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import modelos.User;
import org.junit.jupiter.api.Assertions;
import reader.JsonReader;

public class LecturaJsonStepDefinition {

    private User user;

    @Given("Leo el JSON de User")
    public void leerJsonUser() {

        user = JsonReader.leerUsuarioJson();

    }

    @Then("Verifico que el id sea positivo")
    public void verificarId() {

        Assertions.assertTrue(user.getId() > 0);

    }

    @Then("Verifico que la longitud sea {double}")
    public void verificarLongitud(double longitud) {

        Assertions.assertEquals(user.getAddress().getGeo().getLng(),longitud);

    }

    @Then("Verifico que la longitud de company bs sea mayor que {int}")
    public void verificarLongitudCompany(int longitudCompany) {

        Assertions.assertTrue(user.getCompany().getBs().length() > longitudCompany);

    }
}
