package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Webdriver {
    private static WebDriver driver;
    public static WebDriver getWebDriver(){
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            String browserType = LocalConfigUtils.getProperty("browser");
            System.out.println("browser::: " +browserType);

            switch (browserType.toLowerCase()){
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    //  System.setProperty("webdriver.gecko.driver" , "/Users/khaliunaabaasandorj/Downloads/drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    // System.setProperty("webdriver.chrome.driver" , "/Users/khaliunaabaasandorj/Downloads/drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;
            }

        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;

    }


    public static void killDriver() {
        if ( driver != null) {
            driver.quit();
        }
        driver = null;


    }
}
