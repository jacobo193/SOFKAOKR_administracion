package pom.steps;

import co.com.sofka.administracion.test.controllers.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ModificarKr {

    private WebDriver driver;

    @Given("^: estoy en mi kr$")
    public void estoyEnMiKr() throws InterruptedException {
        driver = DriverController.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginController.startUp(driver,"https://pruebafrontfinal.web.app/");
        LoginController.login(driver);
        LoginController.clickAccpetButton(driver);
        HomeController.okrButtonclick(driver);
        MisOkrController.editKrButton(driver);
    }

    @When("^: cambie un campo$")
    public void cambieUnCampo() {
        KrController.setKrNewDescription(driver);

    }

    @Then("^: se desplegara una alerta$")
    public void seDesplegaraUnaAlerta() {
        Assert.assertEquals(KrController.alertText(driver).getText(),"¿Esta seguro que desea actualizar?");
        driver.quit();
    }
}
