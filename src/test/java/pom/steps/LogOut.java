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

public class LogOut {
    WebDriver driver;
    @Given("^: que estoy en la pagina home$")
    public void que_estoy_en_la_pagina_home() throws InterruptedException {
        driver = DriverController.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginController.startUp(driver,"https://pruebafrontfinal.web.app/");
        LoginController.login(driver);
        LoginController.clickAccpetButton(driver);


    }

    @When("^: le doy al boton de log out$")
    public void le_doy_al_boton_de_log_out() {
        HomeController.logOutButton(driver);


    }

    @Then("^: volvere a la pagina de log out$")
    public void volvere_a_la_pagina_de_log_out()  {
        Assert.assertEquals(LoginController.nosotrosMasage(driver).getText(),"Nosotros");
        driver.quit();

    }

}
