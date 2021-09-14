package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Webdriver;

public class TeslaPage {
    public TeslaPage() {
        PageFactory.initElements(Webdriver.getWebDriver(), this);

    }

    @FindBy(xpath = "//a[@ class ='tds-menu-header-nav--list_link']")
    public WebElement go;
     @FindBy (id = "charge")
    public WebElement charge;
     @FindBy( id = "selfDrive")
    public WebElement selfDrive;
}

