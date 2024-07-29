package demoBlaze.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoBlaze.Utility.DemoBlazeBASE;

public class DemoBlazeProfilePageLocators extends DemoBlazeBASE {

	 public DemoBlazeProfilePageLocators() {  
			PageFactory.initElements(driver,this); 
			
		}
		
		@FindBy(linkText = "Welcome Shayla Binte Alam")
		public WebElement MyProfile;
}
