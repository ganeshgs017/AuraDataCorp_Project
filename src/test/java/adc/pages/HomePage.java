package adc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import adc.utils.AdcBaseTest;

public class HomePage extends AdcBaseTest {
	
	
	@FindBy(xpath = "//a[@class=\"bnr_btn w-inline-block\"]")
	WebElement downArrow;
	
	@FindBy(xpath = "//a[text()='Home']")
	WebElement homeelement;
	
	@FindBy(xpath = "//a[text()='About us']")
	WebElement aboutuselement;
	
	@FindBy(xpath = "//a[text()='Services']")
	WebElement serviceselement;
	

	@FindBy(xpath = "//a[text()='Contact']")
	WebElement contactelement;
	

	
	public void checkBrokenlink() {
		
		BrokenUrl();
	}
	
	public void clickarrow() {
		
		clickAction(downArrow);
	}
	
	
	public void clickHomeOption() {
		
		clickAction(homeelement);
		
	}
	
	public void clickAboutus() {
	
		clickAction(aboutuselement);
		
	}
	
	public void clickServices() {
		
		clickAction(serviceselement);
	}
	
	public void clickContact() {
		
		clickAction(contactelement);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
