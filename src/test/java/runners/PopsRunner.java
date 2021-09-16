package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


    plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
    features = "src/test/resources/features/pops.feature",
        glue = {"steps","hooks"}
       // dryRun = true,
       // tags = "@promotion"

)
public class PopsRunner {
}
