package pom.steps;

import co.com.sofka.administracion.test.controllers.DriverController;
import co.com.sofka.administracion.test.controllers.HomeController;
import co.com.sofka.administracion.test.controllers.LoginController;
import co.com.sofka.administracion.test.controllers.MisOkrController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CrearOkr {

    private WebDriver driver;

    @Given("^: una ves me autentique correctamente$")
    public void una_ves_me_autentique_correctamente() throws InterruptedException {
        driver = DriverController.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginController.startUp(driver,"https://pruebafrontfinal.web.app/");
        LoginController.login(driver);
        LoginController.clickAccpetButton(driver);


    }

    @When("^: doy click en el boton de Mis Okrs$")
    public void doy_click_en_el_boton_de_Mis_Okrs()  {
        HomeController.okrButtonclick(driver);


    }

    @Then("^: vere un boton llamdo Craar OKr$")
    public void vere_un_boton_llamdo_Craar_OKr()  {
        Assert.assertEquals(MisOkrController.CrearOkrtext(driver).getText(),"Crear OKR");
        driver.quit();



    }



}
