package impls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.popsPage;
import utils.CucumberLogUtils;
import utils.LocalConfigUtils;
import utils.Webdriver;

public class popsImpl {

    private pages.popsPage popsPage;
    private popsPage getPage(){
        if(popsPage ==null){
            popsPage = new popsPage(Webdriver.getWebDriver());
        }
        return popsPage;
    }
    public void navigateToPage() {
        String url = LocalConfigUtils.getProperty("url");
        Webdriver.getWebDriver().get(url);
        Webdriver.getWebDriver().manage().window().maximize();
        System.out.println("first is working " );
        CucumberLogUtils.logPass("Successfully navigated to the url", false);
    }

    public void inputtingContent(String content) {
       WebElement search = Webdriver.getWebDriver().findElement(By.xpath("//input [@class='gLFyf gsfi']"));
       search.sendKeys(content);
      Webdriver.getWebDriver().findElement(By.xpath("//input [@name='btnK']")).click();
    }

    public void clickingPopsPoker(String popsPoker) {
        popsPoker="//div [@class='dbg0pd']";
        Webdriver.getWebDriver().findElement(By.xpath(popsPoker)).click();
    }

    public void clickingWebsite(String website) {
        website = "//* [@class]//div[text()='"+website+"']";
        Webdriver.getWebDriver().findElement(By.xpath(website)).click();
    }

    public void navigatingBack() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Webdriver.getWebDriver().
        Webdriver.getWebDriver().navigate().back();
    }
}
