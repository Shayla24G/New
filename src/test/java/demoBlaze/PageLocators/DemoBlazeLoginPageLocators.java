package demoBlaze.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoBlaze.Utility.DemoBlazeBASE;

public class DemoBlazeLoginPageLocators extends DemoBlazeBASE{

	public DemoBlazeLoginPageLocators() {  
		PageFactory.initElements(driver,this); 
		
	}
	
	@FindBy(id = "loginusername")
	public WebElement UserID;//ElementNamne;
	

	@FindBy(id = "loginpassword")
	public WebElement UserPassword;//ElementNamne;
	

	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement loginButton;//ElementNamne;
}
