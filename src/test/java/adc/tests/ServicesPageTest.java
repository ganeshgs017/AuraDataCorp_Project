package adc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import adc.pages.ServicePage;
import adc.utils.AdcReports;

@Listeners(AdcReports.class)

public class ServicesPageTest extends ServicePage{
	
	AdcReports report = new AdcReports();
	
	@Test
	public void checkAllServices() {
		
	try {
		
		report.setTestCaseDesc("Validating the Service Option Elements");		
		
		launchBrowser("https://www.auradatacorp.com");
		Thread.sleep(2000);
		
		ServicePage adc = PageFactory.initElements(driver, ServicePage.class);

		adc.clickServiceOption();
		Thread.sleep(1000);
		
		adc.clickServiceOption1();
		Thread.sleep(1000);
		
		adc.clickServiceOption2();
		Thread.sleep(1000);
		
		adc.clickServiceOption3();
		Thread.sleep(1000);
	
		adc.clickServiceOption4();
		Thread.sleep(1000);
		
		adc.clickServiceOption5();
		Thread.sleep(1000);
		
		adc.clickServiceOption6();
		Thread.sleep(1000);
		
		adc.clickServiceOption7();
		Thread.sleep(1000);
		
		adc.clickServiceOption8();
		Thread.sleep(1000);
	
		adc.clickServiceOption9();
		Thread.sleep(1000);
		
		adc.clickServiceOption10();
		Thread.sleep(1000);
		
		adc.clickServiceOption11();
		Thread.sleep(1000);
		
		adc.clickServiceOption12();
		Thread.sleep(1000);
	
		adc.clickServiceOption13();
		Thread.sleep(1000);
	
		adc.clickServiceOption14();
		Thread.sleep(1000);
		
		adc.clickServiceOption15();
		Thread.sleep(1000);
		
		adc.clickServiceOption16();
		Thread.sleep(1000);
		
		adc.clickServiceOption17();
		Thread.sleep(1000);
		
		adc.clickServiceOption18();
		Thread.sleep(1000);
		
		adc.clickServiceOption19();
		Thread.sleep(1000);
		
		adc.clickServiceOption20();
		Thread.sleep(1000);
		
		adc.clickServiceOption21();
		Thread.sleep(1000);
		
		adc.clickServiceOption22();
		Thread.sleep(1000);
		
		adc.clickServiceOption23();
		Thread.sleep(1000);
		
		adc.clickServiceOption24();
		Thread.sleep(1000);
		
		
		adc.clickServiceOption25();
		Thread.sleep(1000);
		
		adc.clickServiceOption26();
		Thread.sleep(2000);
		
		adc.quitbrowser();
	
	
	
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

}
}