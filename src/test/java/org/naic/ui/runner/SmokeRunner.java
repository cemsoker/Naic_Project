package org.naic.ui.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = {"src/test/resourcess"},
        glue = "src/test/java/org/naic/stepdef"
        , dryRun = false
        , tags = "@smoke"
)
public class SmokeRunner {
}
