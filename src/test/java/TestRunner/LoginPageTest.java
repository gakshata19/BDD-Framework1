package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/LoginPage.feature"},
		glue= {"StepDefination"},
		monochrome=true,
		dryRun=false,
		plugin= {"html:Reports/Report1.html",
						"json:Reports/Report2.json",	
						"junit:Reports/Report3.xml",
						"pretty:Reports/Report4.txt",
						"rerun:rerun/failed_scenarios.txt"}		
		)
public class LoginPageTest {

	
}
