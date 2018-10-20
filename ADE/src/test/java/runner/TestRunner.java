package runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report",
		"json:target/cucumber.json", "junit:target/cucumber.xml",
		"rerun:target/rerun.txt" },
		dryRun=true,
		features = { "Features" },
		glue = { "stepDefinition" },
		strict = true,
		monochrome = true,
		tags = { "@login" }// what
// tags
// to
// include(@)/exclude(~@)
)
public class TestRunner {

	@BeforeClass
	public static void beforeClass() {

		SimpleDateFormat dateformat = new SimpleDateFormat(
				"yyyy-MM-dd hh-mm-ss");
		System.setProperty("currentdate", dateformat.format(new Date()));
	}

}
