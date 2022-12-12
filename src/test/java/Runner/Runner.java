package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"signIn.feature"},
		glue= {"SignInSTepFile.java"},
		dryRun=false,
		monochrome=true
		
		)

public class Runner {

}
