package co.com.sofka.administracion.test.controllers;

import co.com.sofka.administracion.test.pages.OKrPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MisOkrController {
    private WebDriver driver;
    static Logger log = Logger.getLogger(LoginController.class.getName());

    public MisOkrController(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement  CrearOkrtext(WebDriver driver) {
        log.info("Click en el boton Crear OKR");
        OKrPage OKrPage = new OKrPage(driver);
        return OKrPage.getCrearOkrButton();

    }
    public static void clickOkrButton(WebDriver driver){
        OKrPage OKrPage = new OKrPage(driver);
        OKrPage.getCrearOkrButton().click();
    }

    public static void editOkrButton(WebDriver driver){
        log.info("Click en editar OKr");
        OKrPage OKrPage = new OKrPage(driver);
        OKrPage.getEditOkr().click();
    }

    public static void editKrButton(WebDriver driver){
        log.info("Click en editar Kr");
        OKrPage oKrPage = new OKrPage(driver);
        oKrPage.getEditKr().click();
    }
}
