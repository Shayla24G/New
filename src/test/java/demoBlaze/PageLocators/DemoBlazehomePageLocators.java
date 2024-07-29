package demoBlaze.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoBlaze.Utility.DemoBlazeBASE;

public class DemoBlazehomePageLocators extends DemoBlazeBASE{
	
	public DemoBlazehomePageLocators() {  
		PageFactory.initElements(driver,this); 
		
	}
	@FindBy(linkText = "Log in")
	public WebElement Userlogin;
	
	@FindBy(linkText = "Contact")
	public WebElement ClickContact;
	
	@FindBy(linkText = "Contact")
	public WebElement ClickContact1;
	
	@FindBy(xpath = "//button[text()='Send message']")
	public WebElement  SendMessageButton;
	
	@FindBy(linkText = "Samsung galaxy s6")
	public WebElement VerifyContractSend;
	
	
}
