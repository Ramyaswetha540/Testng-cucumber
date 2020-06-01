package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="C:\\Users\\14388\\eclipse-workspace\\TestNG_CUCUMBER\\src\\main\\java\\features\\examplelogin.feature",
		glue= {"stepdefination"},
		format= {"pretty",
				"html:target/cucmber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
		},plugin="json:target/cucumber-reports/CucumberTestReport.json"
		)
		public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setUp()
	{
		testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
	}
@Test(groups="cucumber",description="Runs Cucumber Feature",dataProvider="features")
public void feature(CucumberFeatureWrapper cucumberfeature)
{
	testNGCucumberRunner.runCucumber(cucumberfeature.getCucumberFeature());
}
@DataProvider
public Object[][] features()
{
	return testNGCucumberRunner.provideFeatures();

}
@AfterClass(alwaysRun=true)
public void tearDown()
{
	testNGCucumberRunner.finish();
}


}
