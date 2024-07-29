package demoBlazeStep_defi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demoBlaze.PageActions.DemoBlazeLoginPageActions;
import demoBlaze.PageActions.DemoBlazeProfilePageActions;
import demoBlaze.PageActions.DemoBlazehomePageActions;
import demoBlaze.Utility.DemoBlazeBASE;

public class VerifyLogin extends DemoBlazeBASE {
		DemoBlazehomePageActions demoBlazehomePageActions = new DemoBlazehomePageActions();
		DemoBlazeLoginPageActions demoBlazeLoginPageActions = new DemoBlazeLoginPageActions();
		DemoBlazeProfilePageActions  demoBlazeProfilePageActions = new  DemoBlazeProfilePageActions();
		
		@Given("^Open \"([^\"]*)\" application$")
		public void open_application(String URL) throws Throwable {
		   ecommerceURLSetup(URL);
	}

	@Then("^Click LOGIN link$")
	public void click_LOGIN_link() throws Throwable {
		demoBlazehomePageActions.Click_LOGIN_link();
	}

	

	@Then("^Enter valid Username and Password and Click login$")
	public void enter_valid_Username_and_Password_and_Click_login() throws Throwable {
		demoBlazeLoginPageActions.EcommerceCard(ecommerceProp.getProperty("BlazeUsername"),ecommerceProp.getProperty("BlazePassword"));
	}

	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
		demoBlazeProfilePageActions.Verify_user_can_login();
	}


}
