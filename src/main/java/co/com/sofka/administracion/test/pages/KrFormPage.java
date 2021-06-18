package co.com.sofka.administracion.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KrFormPage {

    WebDriver driver;



    @FindBy(className = "swal-title")
   WebElement alertKr;

    @FindBy(id = "input_description_okr")
    WebElement krDescription;


    @FindBy(css = ".MuiButtonBase-root:nth-child(2) > .MuiButton-label")
    WebElement actualizarKrDescription;



    public KrFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    public WebElement getKrDescription() {
        return krDescription;
    }


    public WebElement getActualizarKrDescription() {
        return actualizarKrDescription;
    }

    public WebElement getAlertKr() {
        return alertKr;
    }

}
