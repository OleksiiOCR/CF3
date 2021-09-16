package steps;

import impls.popsImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.popsPage;
import utils.Webdriver;

public class PopsStepDer {

         popsPage popspage = new popsPage(Webdriver.getWebDriver());



        @Given("I am navigating to the google")
        public void iAmNavigatingToTheGoogle() {
            popsImpl impl  =  new popsImpl();
            impl.navigateToPage();
        }

    @Then("I am inputting {string} in search window")
    public void iAmInputtingInSearchWindow(String content) {
        popsImpl impl  =  new popsImpl();
        impl.inputtingContent(content);
    }

    @Then("I am clicking {string} link")
    public void iAmClickingLink(String popsPoker) {
            popsImpl impl = new popsImpl();
            impl.clickingPopsPoker(popsPoker);

    }

    @Then("I am clicking {string} button")
    public void iAmClickingButton(String website) {
            popsImpl impl = new popsImpl();
            impl.clickingWebsite(website);
    }

    @And("Navigating back")
    public void navigatingBack() {
        popsImpl impl = new popsImpl();
        impl.navigatingBack();
    }
}

