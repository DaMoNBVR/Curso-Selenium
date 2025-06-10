package principal;

import modelos.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.JsonReader;
import utilities.BaseTest;

public class JsonUserTests extends BaseTest {

    private User user;

    @BeforeMethod
    public void setUp() {

        user = JsonReader.leerUsuarioJson();

    }

    @Test
    public void primerTest() {

        Assert.assertTrue(user.getId() > 0);

    }

    @Test
    public void segundoTest() {

        Assert.assertEquals(user.getAddress().getGeo().getLng(), 71.7478);

    }

    @Test
    public void tercerTest() {

        Assert.assertTrue(user.getCompany().getBs().length() > 10);

    }

    @Test
    public void cuartoTest() {

        softAssert.assertEquals(user.getName(),"Mrs. Dennis Schulist");
        softAssert.assertEquals(user.getId(),6);
        softAssert.assertEquals(user.getUsername(),"Leopoldo_Corkery");
        softAssert.assertEquals(user.getWebsite(),"ola.org");
        softAssert.assertAll();

    }
}
