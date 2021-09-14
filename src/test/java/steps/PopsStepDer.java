package steps;

import impls.popsImpl;
import io.cucumber.java.en.Given;
import pages.popsPage;
import utils.Webdriver;

public class PopsStepDer {

         popsPage popspage = new popsPage(Webdriver.getWebDriver());



        @Given("I am navigating to the google")
        public void iAmNavigatingToTheGoogle() {
            popsImpl impl  =  new popsImpl();
            impl.navigateToPage();
        }

        }

