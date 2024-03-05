package adc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import adc.utils.AdcBaseTest;

public class ContactPage extends AdcBaseTest {

/*	@FindBy(xpath = "//a[text()='Contact']")
	WebElement contactOption;
	*/

	@FindBy(xpath = "//button[@class=\"owl-prev\"]")
	WebElement previewOption;

	@FindBy(xpath = "//button[@class=\"owl-next\"]")
	WebElement nextOption;

	@FindBy(xpath =  "//div[text()=\"More articles\"]")
	WebElement moreArticles;
	
	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div[1]/a")
	WebElement secureworkPage;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div[2]/a")
	WebElement iso20022Page;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div[3]/a")
	WebElement crowdStrikePage;

	@FindBy(linkText = "10204 Marchant lane, Irving, Tx 75063")
	WebElement usaLocation;
	
	@FindBy(linkText = "The One Tower, Floor 24, Sheikh Zayed Road, Dubai, PO Box 390114")
	WebElement dubaiLocation;
	
	@FindBy(linkText = "linkedin.com/company/auradata-technologies")
	WebElement linkedinprofile;
	
	
/*	public void clickContactOption() {

		clickAction(contactOption);
	}
*/
	public void clickPreview() {

		scrollupandDown(4270);
	
		clickAction(previewOption);
		
	//	clickAction(previewOption);
	
	}	

	public void clickNext() {

	
		jsClick(nextOption);
	}

	public void clickMoreArticles() {
		
		scrolluptoElement(moreArticles);
		
	}
	
	public void navigateToSecurework() {

		//scrolluptoElement(secureworkPage);
		clickAction(secureworkPage);
		
	}

	public void navigateTOISO20022() {

		clickAction(iso20022Page);
		
	}

	public void navigateToCrowdStrike() {

		clickAction(crowdStrikePage);
		
	}

	public void clicklocation1() {
		
		scrolluptoElement(usaLocation);
		clickAction(usaLocation);
	}
	
	public void clicklocation2() {
		
		clickAction(dubaiLocation);
	}
	
	public void clickprofile() {
		
		clickAction(linkedinprofile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}