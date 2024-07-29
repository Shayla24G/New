package demoBlaze.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import demoBlaze.Utility.DemoBlazeBASE;

	@CucumberOptions(features = {"src/test/resourcess/demoBlazeALLFeatures"},
	plugin = {"json:target/cucumber.json"}, 
	glue = "demoBlazeStep_defi",tags={"@test1"})
	
	public class DemoTestRunner extends AbstractTestNGCucumberTests{
		
		@BeforeTest
		 public void DemoBlazeStartURL() {   
			DemoBlazeBASE EStart = new DemoBlazeBASE (); 
			 EStart.ecommerceBrowserSetup(); 
			 
		 }
		
		 @AfterTest
		 public void DemoBlazeCloseBrowser() {
			 DemoBlazeBASE EStart = new DemoBlazeBASE();
			 EStart.driver.quit();
			 
		 }
}
