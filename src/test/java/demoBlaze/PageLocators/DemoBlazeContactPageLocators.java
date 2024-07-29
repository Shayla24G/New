package demoBlaze.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoBlaze.Utility.DemoBlazeBASE;

public class DemoBlazeContactPageLocators extends DemoBlazeBASE {

	public DemoBlazeContactPageLocators() {  
		PageFactory.initElements(driver,this); 
		
	}
	@FindBy(id = "exampleModalLabel")
	public WebElement NewmessageWindow;
	
	@FindBy(id = "recipient-email")
	public WebElement EnterEmail;
	
	@FindBy(id = "recipient-name")
	public WebElement EnterName;
	
	@FindBy(id = "message-text")
	public WebElement EnterMessage;
	
	
}
