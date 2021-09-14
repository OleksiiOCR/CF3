package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Webdriver;

public class popsPage {
    public popsPage(WebDriver webDriver) {

      PageFactory.initElements(Webdriver.getWebDriver(), this);
    }
    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement searchF;

  //  @FindBy(id = "search")
  //  public WebElement search;
}