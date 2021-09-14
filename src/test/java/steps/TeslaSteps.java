package steps;

import io.cucumber.java.en.Given;
import pages.TeslaPage;

public class TeslaSteps {
    TeslaPage tesla = new TeslaPage();

    @Given("Lets go Tesla")
    public void lets_go_tesla() {
        tesla.go.sendKeys("go go go ");
        tesla.charge.sendKeys("charging");
        tesla.selfDrive.getAttribute("selfDriving");
    }

}
