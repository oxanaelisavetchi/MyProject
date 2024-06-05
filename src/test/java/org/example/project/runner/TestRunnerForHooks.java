package org.example.project.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = {"org.example.project.ui.steps", "org.example.project.hooks"},
         //plugin = {"pretty", "html:target/HtmlReports"},
         plugin = {"pretty", "json:target/JSONReports/report.json"}
       // plugin = {"pretty", "junit:target/JUnitReports/report.xml"}


)

public class TestRunnerForHooks {

}
