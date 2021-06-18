package pom.steps;

import co.com.sofka.administracion.test.controllers.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ModificarOKr {

    private WebDriver driver;

    @Given("^: estoy en mi Okr$")
    public void estoyEnMiOkr() throws InterruptedException {
        driver = DriverController.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginController.startUp(driver,"https://pruebafrontfinal.web.app/");
        LoginController.login(driver);
        LoginController.clickAccpetButton(driver);
        HomeController.okrButtonclick(driver);
        MisOkrController.editOkrButton(driver);
    }

    @When("^: modifique un campo$")
    public void modifiqueUnCampo() {
        OkrformController.setNewDescription(driver);
    }

    @Then("^: aparecera una alerta$")
    public void apareceraUnaAlerta() {

        Assert.assertEquals(OkrformController.calertText(driver).getText(),"¿Esta seguro que desea actualizar?");
        driver.quit();
    }


}
