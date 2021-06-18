package pom.steps;

import co.com.sofka.administracion.test.controllers.DriverController;
import co.com.sofka.administracion.test.controllers.LoginController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LoginStep {

    private WebDriver driver;

    @Given("^un usuario en la pagina de login$")
    public void unUsuarioEnLaPaginaDeLogin() {
        driver = DriverController.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginController.startUp(driver,"https://pruebafrontfinal.web.app/");
    }

    @When("^quiere logearse usando su cuenta google$")
    public void quiereLogearseUsandoSuCuentaGoogle() throws InterruptedException {
        LoginController.login(driver);

    }

    @Then("^se logea exitosamente$")
    public void seLogeaExitosamente() {

        Assert.assertEquals(LoginController.wlecomeMassageModal(driver).getText(), "!!Te damos la bienvenida LUIS, Estamos felices de tenerte con nosotros!!");
        driver.quit();

    }


}
