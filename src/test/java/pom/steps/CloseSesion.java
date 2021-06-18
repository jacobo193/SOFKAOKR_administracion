package pom.steps;

import co.com.sofka.administracion.test.controllers.DriverController;
import co.com.sofka.administracion.test.controllers.LoginController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CloseSesion {
    private WebDriver driver;
    static Logger log = Logger.getLogger(LoginController.class.getName());

    @Given("^: Estoy en la home page$")
    public void estoy_en_la_home_page() throws InterruptedException {
        driver = DriverController.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginController.startUp(driver,"https://pruebafrontfinal.web.app/");
        LoginController.login(driver);
        LoginController.clickAccpetButton(driver);

    }

    @When("^: Dejo la pagina inactiva por dos minutos$")
    public void dejo_la_pagina_inactiva_por_dos_minutos() throws InterruptedException {
        log.info("esperando 2 minutos");
        Thread.sleep(120000);

    }

    @Then("^: La sesion se cerrara$")
    public void la_sesion_se_cerrara() {
        Assert.assertEquals(LoginController.nosotrosMasage(driver).getText(),"Nosotros");
        driver.quit();

    }






}
