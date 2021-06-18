package pom.steps;

import co.com.sofka.administracion.test.controllers.DriverController;
import co.com.sofka.administracion.test.controllers.HomeController;
import co.com.sofka.administracion.test.controllers.LoginController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MisOkrs {

    private WebDriver driver;
    @Given("^: conozco la ruta del aplicativo$")
    public void conozco_la_ruta_del_aplicativo()  {
        driver = DriverController.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginController.startUp(driver,"https://pruebafrontfinal.web.app/");

    }

    @When("^: y me autentico correctamente$")
    public void y_me_autentico_correctamente() throws InterruptedException {
        LoginController.login(driver);
        LoginController.clickAccpetButton(driver);

    }

    @Then("^: en Home ver un Boton llamado mis Okrs$")
    public void en_Home_ver_un_Boton_llamado_mis_Okrs()  {
        Assert.assertEquals(HomeController.createOkrGetText(driver).getText(), "Mis OKR");
        driver.quit();


    }




}
