package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"@rerun/failed_scenarios.txt"},
			glue= {"StepDefination"},
			monochrome=true,
			dryRun=false,
			plugin= {"html:FailedTest/Report1.html",
					"json:FailedTest/Report2.json",	
					"junit:FailedTest/Report3.xml",
					"pretty:FailedTest/Report4.txt"	
			}
		)
public class FailedTestCases {

}
