package demoBlaze.PageActions;


import demoBlaze.PageLocators.DemoBlazeLoginPageLocators;
import demoBlaze.Utility.DemoBlazeBASE;

public class DemoBlazeLoginPageActions extends DemoBlazeBASE{
	 DemoBlazeLoginPageLocators  demoBlazeLoginPageLocators = new  DemoBlazeLoginPageLocators(); // create objct
		
		public void EcommerceCard(String U, String P) throws Exception { //we are using string parameter method for pass the value/// here U means User and p means pass
			Thread.sleep(5000);
			 demoBlazeLoginPageLocators.UserID.sendKeys(U);
			 demoBlazeLoginPageLocators.UserPassword.sendKeys(P);
			 demoBlazeLoginPageLocators.loginButton.click();
		}
}
