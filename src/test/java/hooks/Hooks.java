package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

import utils.ConfigReader;
import utils.CucumberLogUtils;
import utils.Webdriver;
import io.cucumber.java.Before;

public class Hooks {
    @Before
  public void setUp(Scenario currentScenario){
      System.out.println("=============Setting up");
      CucumberLogUtils.initScenario(currentScenario);
   // public void setUp() {
  //      Webdriver.getWebDriver().get(ConfigReader.getProperties("url"));
    }
    @After
    public void tearDown() {
        Webdriver.killDriver();
    }
}
