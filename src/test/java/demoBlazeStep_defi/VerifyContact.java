package demoBlazeStep_defi;

import cucumber.api.java.en.Then;
import demoBlaze.PageActions.DemoBlazeContactPageActions;
import demoBlaze.PageActions.DemoBlazehomePageActions;
import demoBlaze.Utility.DemoBlazeBASE;

public class VerifyContact extends DemoBlazeBASE {
	DemoBlazehomePageActions demoBlazehomePageActions = new DemoBlazehomePageActions();
	DemoBlazeContactPageActions demoBlazeContactPageActions = new DemoBlazeContactPageActions();
	
	@Then("^Verify Contact Functionality in header of the page$")
	public void verify_Contact_Functionality_in_header_of_the_page() throws Throwable {
		demoBlazehomePageActions.Verify_Contact_Functionality_in_header_of_the_page();
	}

	@Then("^Click Contact and Verify the New Message window successfully$")
	public void click_Contact_and_Verify_the_New_Message_window_successfully() throws Throwable {
		demoBlazeContactPageActions.Click_Contact_and_Verify_the_New_Message_window_successfully();
	}
	@Then("^Click Contact$")
	public void click_Contact() throws Throwable {
		demoBlazehomePageActions.Click_Contact();
	}
	@Then("^Enter valid Email and Name and Message and click send message$")
	public void enter_valid_Email_and_Name_and_Message_and_click_send_message() throws Throwable {
	   
		demoBlazeContactPageActions.EcommerceContactCard(ecommerceProp.getProperty("BlazeUseremail"),ecommerceProp.getProperty("BlazeUsername"),ecommerceProp.getProperty("BlazeMessage"));
		
		demoBlazehomePageActions.Send_Message_button_successfully();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	}

	@Then("^Verify Send Message button successfully$")
	public void verify_Send_Message_button_successfully() throws Throwable {
		demoBlazehomePageActions.verifySendContract();
	}



}
