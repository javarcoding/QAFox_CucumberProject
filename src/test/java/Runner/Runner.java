package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features/Login.feature"},
		glue= {"StepDefinitions"},
		dryRun=true,
		monochrome=true,
		
		plugin= {"html:target/cucumber_html_report"}
		
		)
public class Runner {

}