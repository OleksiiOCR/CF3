package impls;

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
        System.out.println("first is working " );
        CucumberLogUtils.logPass("Successfully navigated to the url", false);
    }
}
