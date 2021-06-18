package co.com.sofka.administracion.test.controllers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverController {

    public static WebDriver getDriver(){


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("--lang=es");
        //options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");
        return new ChromeDriver(options);
    }
}
