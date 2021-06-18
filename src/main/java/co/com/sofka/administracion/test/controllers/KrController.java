package co.com.sofka.administracion.test.controllers;

import co.com.sofka.administracion.test.pages.KrFormPage;
import com.github.javafaker.Faker;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KrController {
     private WebDriver driver;
    static Logger log = Logger.getLogger(LoginController.class.getName());
    public KrController(WebDriver driver) {
        this.driver = driver;
    }

    public static void setKrNewDescription(WebDriver driver){
        log.info("modificando Kr");
        Faker faker = new Faker();
        KrFormPage krFormPage = new KrFormPage(driver);
        krFormPage.getKrDescription().sendKeys(Keys.chord(Keys.CONTROL, "prueba 1", Keys.DELETE));
        krFormPage.getKrDescription().sendKeys(faker.zelda().character());
        krFormPage.getActualizarKrDescription().click();



    }

    public static WebElement alertText (WebDriver driver){
        KrFormPage krFormPage = new KrFormPage(driver);
        driver.switchTo().activeElement();
        return krFormPage.getAlertKr();

    }

}
