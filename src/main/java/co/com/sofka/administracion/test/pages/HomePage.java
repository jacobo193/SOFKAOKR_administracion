package co.com.sofka.administracion.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(css  = "body > div.fade.modal.show > div > div > div.modal-body > h3")
    WebElement welcomeMassage;

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    @FindBy(css = "#responsive-navbar-nav > div:nth-child(4) > div > svg")
    WebElement logoutButton;

    @FindBy(css = ".btn")
    WebElement acceptButton;


    @FindBy(css = "button[class*= btn-outline-light]")
    private WebElement createOkrBtn;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getOkrBtn(){
        return createOkrBtn;
    }

    public WebElement getWelcomeMassage() {

        return  welcomeMassage;
    }

    public WebElement getAcceptButton() {
        return acceptButton;
    }








}
