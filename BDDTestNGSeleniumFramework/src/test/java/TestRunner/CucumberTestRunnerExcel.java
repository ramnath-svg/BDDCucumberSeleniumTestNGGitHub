package TestRunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/Feature/loginnew.feature",
	    glue = {"StepDefinitions", "PageObjects", "Hooks"},
	    plugin = {"pretty", "html:target/html.report.html"},
	    tags = "@loginexcel"
	)

public class CucumberTestRunnerExcel extends AbstractTestNGCucumberTests {
	
	 @Parameters("browser")
	 @BeforeClass
	 public void setBrowser(@Optional("chrome") String browser) {
	        System.setProperty("browser", browser);
	        System.out.println("Running on browser: " + browser);
	    }

}
