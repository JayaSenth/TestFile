package TestRunner;



import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import BaseClass.BaseClass;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    
    @RunWith(Cucumber.class)
	@CucumberOptions(features = "src//test//java//com//adactin//feature",
	glue = "com.adactin.stepdefinition" ,
	monochrome = true,
	dryRun = false,
	strict = false,
	tags= ("@smokeTest"),
	plugin = {"html:Report/Html_Report" ,

	"pretty",

	"json:Reports/Cucumber.json",

	"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"

	})

	public class TestRunner {

	public static WebDriver driver; // --> null

	@BeforeClass
	public static void setUp() throws Throwable {

//	String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();

	driver = Base_Class.getDriver("chrome");

	}

	@AfterClass
	public static void tearDown() {

	driver.close();

	}

}
