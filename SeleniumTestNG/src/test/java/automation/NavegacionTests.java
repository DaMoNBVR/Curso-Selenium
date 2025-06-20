package automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class NavegacionTests extends BaseTest {

    @Test (groups = {regression, smoke})
    public void ejercicio1Test(){

        final var url = "https://www.saucedemo.com/";

        Logs.info("Navegando a: %s", url);
        driver.get(url);

        sleep(2000);

        Logs.info("Obteniendo la url actual");
        final var currentUrl = driver.getCurrentUrl();

        Logs.info("Verificando que las urls sean iguales");
        Assert.assertEquals(currentUrl, url);

    }

    @Test(groups = {regression, smoke})
    public void ejercicio2Test(){

        final var urlHeroku = "https://the-internet.herokuapp.com/";
        final  var urlGithub = "https://github.com/";

        Logs.info("Navegando a: %s", urlHeroku);
        driver.get(urlHeroku);

        sleep(2000);

        Logs.info("Navegando a: %s", urlGithub);
        driver.get(urlGithub);

        sleep(3000);

        Logs.info("Regresando a: %s", urlHeroku);
        driver.navigate().back();

        sleep(1500);

        Logs.info("Obteniendo la url actual");
        final var currentUrl = driver.getCurrentUrl();

        Logs.info("Verificando que las urls sean iguales");
        Assert.assertEquals(currentUrl, urlHeroku);

    }

    @Test(groups = {regression, smoke})
    public void siempreFallaTest(){

        final var url = "https://the-internet.herokuapp.com/";

        Logs.info("Navegando a: %s", url);
        driver.get(url);

        sleep(2000);

        Logs.info("Obteniendo la url actual");
        final var currentUrl = driver.getCurrentUrl();

        Logs.info("Verificando que las urls sean iguales");
        Assert.assertEquals(currentUrl, "Hola Mundo");

    }

}
