package generic;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	@Test
	public void test(){
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/extentReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
	}

}
