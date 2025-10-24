package BDD.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:/Users/shaik. sulthanbasha/IdeaProjects/SeleniumBddFrameWork/src/main/java/BDD/Featues/login.feature",
        glue = {"BDD.StepDef"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}


