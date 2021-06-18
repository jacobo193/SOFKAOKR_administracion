package co.com.sofka.administracion.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OkrFormPage {

    @FindBy(id = "input_Okr_titulo")
    private WebElement okrTitleField;



    @FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-title")
    WebElement alertText;

    @FindBy(id = "input_Okr_objetivo")
    private WebElement okrObjectiveField;

    @FindBy(id = "input_Okr_nombre")
    private WebElement okrNameField;

    @FindBy(id = "input_Okr_email")
    private WebElement okrEmailField;

    @FindBy(id = "input_Okr_verticales")
    private WebElement verticalsDropdown;

    @FindBy(id = "input_description_okr")
    private WebElement okrDescriptionField;

    @FindBy(xpath = "//button[text()='Siguiente']")
    private WebElement nextBtn;


    @FindBy(css = ".MuiButtonBase-root:nth-child(2) > .MuiButton-label")
    private WebElement actualizarButton;

    public OkrFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getOkrTitleField() {
        return okrTitleField;
    }

    public WebElement getOkrObjectiveField() {
        return okrObjectiveField;
    }

    public WebElement getOkrNameField() {
        return okrNameField;
    }

    public WebElement getOkrEmailField() {
        return okrEmailField;
    }

    public WebElement getVerticalsDropdown() {
        return verticalsDropdown;
    }

    public WebElement getOkrDescriptionField() {
        return okrDescriptionField;
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public WebElement getActualizarButton() {
        return actualizarButton;
    }
    public WebElement getAlertText() {
        return alertText;
    }
}
