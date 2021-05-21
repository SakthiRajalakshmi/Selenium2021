package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/features.day1/login.feature",glue="steps",monochrome=true, publish=true,dryRun=true,
snippets=SnippetType.CAMELCASE)
public class Run extends AbstractTestNGCucumberTests {



}
