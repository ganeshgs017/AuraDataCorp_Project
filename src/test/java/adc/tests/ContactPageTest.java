package adc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import adc.pages.ContactPage;
import adc.utils.AdcReports;

@Listeners(AdcReports.class)
public class ContactPageTest  extends ContactPage{
	
	
	AdcReports report = new AdcReports();
	
	@Test
	public void checkOtherPages() {
		
		
		try {
			
			report.setTestCaseDesc("Validating the Contact Option  Elements");		
			
			launchBrowser("https://www.auradatacorp.com");
			Thread.sleep(4000);
			
			ContactPage adc = PageFactory.initElements(driver, ContactPage.class);

			/*adc.clickContactOption();
			Thread.sleep(4000);
			*/
			
			adc.clickPreview();
			Thread.sleep(2000);
			
			adc.clickNext();
			Thread.sleep(2000);
			
			adc.clickMoreArticles();
			Thread.sleep(2000);
			
			adc.navigateToSecurework();
			Thread.sleep(8000);
			
			adc.navigateTOISO20022();
			Thread.sleep(8000);
			
			adc.navigateToCrowdStrike();
			Thread.sleep(8000);
			
			adc.clicklocation1();
			Thread.sleep(6000);
			
			adc.clicklocation2();
			Thread.sleep(5000);
			
			adc.clickprofile();
			Thread.sleep(2000);
			
	
			
			
			
			
	}
	
	catch(Exception ex)
		{
		ex.printStackTrace();
		}
		
	}	
	
	
	
}
