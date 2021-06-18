package co.com.sofka.administracion.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebElement getNosotros() {
        return nosotros;
    }

    @FindBy(className = "title")
    WebElement nosotros;

    public WebElement getSesionClose() {
        return SesionClose;
    }

    @FindBy(className = "swal-title")
    WebElement SesionClose;

    @FindBy(css = "img[src='/static/media/BotonGoogle.b08f0455.png']")
    private WebElement loginBtn;

    @FindBy(css = "input#identifierId")
    private WebElement emailField;

    @FindBy(xpath = "//span[text()='Siguiente']")
    private WebElement nextEmailBtn;

    @FindBy(css = "input[name='password']")
    private WebElement passwordField;

    @FindBy(css = "button[class*='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")
    private WebElement nextPasswordBtn;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getNextEmailBtn() {
        return nextEmailBtn;
    }

    public WebElement getNextPasswordBtn() {
        return nextPasswordBtn;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }
}
