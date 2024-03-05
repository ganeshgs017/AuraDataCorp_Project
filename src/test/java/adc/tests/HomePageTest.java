package adc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import adc.pages.HomePage;
import adc.utils.AdcReports;

@Listeners(AdcReports.class)
public class HomePageTest extends HomePage{
	
	AdcReports report = new AdcReports();
	
	@Test
	public void startTest( ) {
		
		try {
			
			report.setTestCaseDesc("Validating the Home Page Elements");		
			
			launchBrowser("https://www.auradatacorp.com");
			Thread.sleep(2000);
			
			HomePage adc = PageFactory.initElements(driver, HomePage.class);

			adc.checkBrokenlink();
			Thread.sleep(2000);
		
			adc.clickarrow();
			Thread.sleep(2000);
			
			adc.clickHomeOption();
			Thread.sleep(2000);
			
			adc.clickAboutus();
			Thread.sleep(2000);
			
			adc.clickServices();
			Thread.sleep(2000);
			
			adc.clickContact();
			Thread.sleep(2000);
			
			adc.quitbrowser();

			
			
		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	

}
