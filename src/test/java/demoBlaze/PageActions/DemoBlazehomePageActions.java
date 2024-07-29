package demoBlaze.PageActions;


import org.testng.Assert;

import demoBlaze.PageLocators.DemoBlazehomePageLocators;
import demoBlaze.Utility.DemoBlazeBASE;

 public class DemoBlazehomePageActions extends DemoBlazeBASE {

	DemoBlazehomePageLocators demoBlazehomePageLocators =new DemoBlazehomePageLocators(); 
	
	public void Click_LOGIN_link() {
		 demoBlazehomePageLocators.Userlogin.click();
	 }
	public void Verify_Contact_Functionality_in_header_of_the_page() {
		demoBlazehomePageLocators.ClickContact.click();
	}
	public void Click_Contact() {
		demoBlazehomePageLocators.ClickContact1.click();
	}
	public void  Send_Message_button_successfully() {
		demoBlazehomePageLocators.SendMessageButton.click();
	}
	public void verifySendContract() {
		
		boolean contractSend = demoBlazehomePageLocators.VerifyContractSend.isDisplayed();
		Assert.assertTrue(contractSend);
	}
}
