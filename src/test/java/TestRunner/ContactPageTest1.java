package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/ContactPage.feature"},
		glue= {"StepDefination"},
		monochrome=true,
		dryRun=false,
		
		plugin= {"html:Report/ContactPage.html",
							"json:Report/ContactPage.json",
							"junit:Report/ContactPage.xml",
							"pretty:Report/ContactPage.txt"}
		
		)
public class ContactPageTest1 {

}
