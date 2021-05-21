package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/features/mergeLead.feature",glue= "steps",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)

public class CreateRun extends AbstractTestNGCucumberTests {

}
