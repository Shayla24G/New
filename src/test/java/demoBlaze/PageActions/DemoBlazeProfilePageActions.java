package demoBlaze.PageActions;

import org.testng.Assert;

import demoBlaze.PageLocators.DemoBlazeProfilePageLocators;
import demoBlaze.Utility.DemoBlazeBASE;

public class DemoBlazeProfilePageActions extends DemoBlazeBASE {
	DemoBlazeProfilePageLocators demoBlazeProfilePageLocators = new DemoBlazeProfilePageLocators();
	
		public void Verify_user_can_login () {
			boolean profile = demoBlazeProfilePageLocators.MyProfile.isDisplayed();
			Assert.assertTrue(profile);
		
	}
	
}
