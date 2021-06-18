package co.com.sofka.administracion.test.controllers;

import co.com.sofka.administracion.test.pages.OkrFormPage;
import com.github.javafaker.Faker;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OkrformController {

    private WebDriver driver;
    static Logger log = Logger.getLogger(LoginController.class.getName());

    public WebDriver getDriver() {
        return driver;

    }

    public static void setNewDescription(WebDriver driver){
        log.info("modificando OKr");
        Faker faker = new Faker();
        OkrFormPage okrFormPage = new OkrFormPage(driver);
        okrFormPage.getOkrDescriptionField().click();
        okrFormPage.getOkrDescriptionField().sendKeys(Keys.chord(Keys.CONTROL, "Parasect", Keys.DELETE));
        okrFormPage.getOkrDescriptionField().sendKeys(faker.pokemon().name());
        okrFormPage.getActualizarButton().click();
    }

    public static WebElement calertText (WebDriver driver){
        OkrFormPage okrFormPage = new OkrFormPage(driver);
        driver.switchTo().activeElement();
        return okrFormPage.getAlertText();

    }


}
