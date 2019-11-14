package co.com.prueba.certificacion.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver {

    private static WebDriver chromeDriver;

    //acceder al navegador chrome
    public static MyChromeDriver web() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        chromeDriver = new ChromeDriver();
        return new MyChromeDriver();
    }

    public WebDriver inUrl(String url){
        chromeDriver.get(url);
        chromeDriver.manage().window().maximize();
        return  chromeDriver;
    }
}
