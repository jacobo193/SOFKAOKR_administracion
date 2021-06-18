package co.com.sofka.administracion.test.controllers;

import co.com.sofka.administracion.test.pages.HomePage;
import co.com.sofka.administracion.test.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class LoginController {
    static Logger log = Logger.getLogger(LoginController.class.getName());


    public static void startUp(WebDriver driver, String url){
        log.info("abriendo navegador y redirigiendo a la  pagina");
        driver.get(url);
    }

    public static void login(WebDriver driver) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        log.info("Click en el boton de google +");
        loginPage.getLoginBtn().click();
        Set<String> windows = driver.getWindowHandles();
        for(String window : windows){
            driver.switchTo().window(window);

            if(driver.getTitle().equals("Inicia sesión: Cuentas de Google")){
                break;
            }
        }
        log.info("introduciendo correo");
        loginPage.getEmailField().sendKeys("lguerrag@unicartagena.edu.co");
        loginPage.getNextEmailBtn().click();
        log.info("introduciendo password");
        loginPage.getPasswordField().sendKeys("1047475866");

        Thread.sleep(1000);

        log.info("realizando autenticacion");
        loginPage.getNextEmailBtn().click();
        Thread.sleep(1000);


        for(String window : windows){
            driver.switchTo().window(window);

            if(driver.getTitle().equals("Sofka OKR'S")){
                break;
            }
        }


    }

    public static WebElement welcomeMassageModal(WebDriver driver){

        HomePage homePage = new HomePage(driver);
        return homePage.getWelcomeMassage();

    }

    public static void clickAcceptButton(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        log.info("aceptar mensaje de bienvendia");
        driver.switchTo().activeElement();
        homePage.getAcceptButton().click();
    }


    public static WebElement nosotrosMessage(WebDriver driver){
        log.info("redirigiendo a la pagina de inicio");
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.getNosotros();
    }

    public static WebElement closeSesionMassege(WebDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        driver.switchTo().activeElement();
        return loginPage.getSesionClose();
    }





}
