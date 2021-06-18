package co.com.sofka.administracion.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OKrPage {

    private WebDriver driver;

    @FindBy(css = "div:nth-child(2) > .container_cards > .MuiPaper-root:nth-child(1) .MuiButtonBase-root:nth-child(1) .MuiSvgIcon-root")
    WebElement editKr;


    @FindBy(css = "div:nth-child(2) > .container_display_title > .MuiButtonBase-root:nth-child(2) .MuiSvgIcon-root")
    WebElement editOkr;


    @FindBy(id = "btnAdmin")
    WebElement CrearOkrButton;


    public OKrPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getCrearOkrButton() {
        return CrearOkrButton;
    }

    public WebElement getEditOkr() {
        return editOkr;
    }

    public WebElement getEditKr() {
        return editKr;
    }

}
