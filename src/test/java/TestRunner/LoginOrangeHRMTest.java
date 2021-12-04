package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"Features/LoginOrangeHRM.feature"},
			glue={"StepDefination"},
			monochrome=true,
			dryRun=false,
			plugin= {"html:Reports/OrangeHRM1.html",
					"json:Reports/OrangeHRM1.json",
					"junit:Reports/OrangeHRM1.xml",
					"pretty:Reports/OrangeHRM1.txt",
					"rerun:rerun/failed_scenarios.txt"
			}
		)
public class LoginOrangeHRMTest {

}
