package demoBlaze.PageActions;

import demoBlaze.PageLocators.DemoBlazeContactPageLocators;
import demoBlaze.Utility.DemoBlazeBASE;

public class DemoBlazeContactPageActions extends DemoBlazeBASE {
	
	DemoBlazeContactPageLocators demoBlazeContactPageLocators = new DemoBlazeContactPageLocators();
	
	public void Click_Contact_and_Verify_the_New_Message_window_successfully()  {
		demoBlazeContactPageLocators.NewmessageWindow.click();
		
	}
	
	public void EcommerceContactCard(String E, String N,String M) throws Exception {

		demoBlazeContactPageLocators.EnterEmail.sendKeys(E);
		demoBlazeContactPageLocators.EnterName.sendKeys(N);
		demoBlazeContactPageLocators.EnterMessage.sendKeys(M);
		
		Thread.sleep(6000);
	}
	
		
	
}
