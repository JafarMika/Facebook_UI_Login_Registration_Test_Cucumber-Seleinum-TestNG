package az.ingress.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"az.ingress.stepDef", "az.ingress.DriverUtils"},
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json"
        },
        monochrome = true
        // tags="@login"
)
public class runners {
    @AfterClass
    public static void afterClass() {

        File reportDir = new File("target/html-reports/cucumber-html-reports");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-report/cucumber.json");

        String projectName = "bddautomation.2";
        String builderVersion = "1.0.0";

        Configuration configuration = new Configuration(reportDir, projectName);
        configuration.setBuildNumber(builderVersion);
        configuration.addClassifications("Platform", "WEB");
        configuration.addClassifications("OS", "Windows 10");
        configuration.addClassifications("Project Name", "FB");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
