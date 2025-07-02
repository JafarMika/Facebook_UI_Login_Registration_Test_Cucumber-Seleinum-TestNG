package az.ingress.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"az.ingress.stepDef","az.ingress.DriverUtils"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
         },
        monochrome = true
       // tags="@login" // You can specify tags to run specific scenarios
)
public class runners {
}
