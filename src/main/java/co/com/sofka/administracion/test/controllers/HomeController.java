package co.com.sofka.administracion.test.controllers;

import co.com.sofka.administracion.test.pages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeController {
    private WebDriver driver;
    static Logger log = Logger.getLogger(LoginController.class.getName());
    public HomeController(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement createOkrGetText(WebDriver driver){

        HomePage homePage = new HomePage(driver);
        return homePage.getOkrBtn();

    }

    public static void okrButton(WebDriver driver){
        HomePage homePage = new HomePage(driver);
        homePage.getOkrBtn().getText();


    }

    public static void okrButtonclick(WebDriver driver){
        log.info("click en el boton mis OKr");
        HomePage homePage = new HomePage(driver);
        homePage.getOkrBtn().click();


    }

    public static void logOutButton(WebDriver driver){
        log.info("click en el boton log out");
        HomePage homePage = new HomePage (driver);
        homePage.getLogoutButton().click();
    }



}
