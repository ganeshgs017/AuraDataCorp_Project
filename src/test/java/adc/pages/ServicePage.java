package adc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import adc.utils.AdcBaseTest;

public class ServicePage extends AdcBaseTest {

	@FindBy(xpath = "//a[text()='Services']")
	WebElement services;

	@FindBy(xpath = "//*[@id=\"w-tabs-0-data-w-tab-0\"]/div/div[1]")
	WebElement serviceName1;

	@FindBy(xpath = "//div[@data-id=\"nextGen\"]")
	WebElement serviceName2;

	@FindBy(xpath = "//div[@data-id=\"coreBanking\"]")
	WebElement serviceName3;

	@FindBy(xpath = "//div[@data-id=\"bankingSolutions\"]")
	WebElement serviceName4;

	@FindBy(xpath = "//div[@data-id=\"digitalCustOnboard\"]")
	WebElement serviceName5;

	@FindBy(xpath = "//div[@data-id=\"digitalPayments\"]")
	WebElement serviceName6;

	@FindBy(xpath = "//div[@data-id=\"openBanking\"]")
	WebElement serviceName7;

	@FindBy(xpath = "//div[@data-id=\"enterpiseFraud\"]")
	WebElement serviceName8;

	@FindBy(xpath = "//div[@data-id=\"loanAutomation\"]")
	WebElement serviceName9;

	@FindBy(xpath = "//div[@class=\"mtm_item_name mtn_tab_caller\"][text()='Digital Insurance']")
	WebElement serviceName10;

	@FindBy(xpath = "//div[@data-id=\"cyberSecurity\"]")
	WebElement serviceName11;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Threat Management']")
	WebElement serviceName12;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Network Security']")
	WebElement serviceName13;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Application Security']")
	WebElement serviceName14;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Data Security']")
	WebElement serviceName15;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Cloud Security']")
	WebElement serviceName16;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Identity & Access Management']")
	WebElement serviceName17;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Governance Risk & Compliance']")
	WebElement serviceName18;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Vulnerability Assessment & Penetration Testing']")
	WebElement serviceName19;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Managed SOC Services']")
	WebElement serviceName20;

	@FindBy(xpath = "//div[@class=\"sbm_txt\"][text()='Emerging Security OT/IoT']")
	WebElement serviceName21;

	@FindBy(xpath = "//div[@class=\"mtm_item_name mtn_tab_caller\"][text()='Cloud Services']")
	WebElement serviceName22;

	@FindBy(xpath = "//div[@class=\"mtm_item_name mtn_tab_caller\"][text()='Intelligent Enterprise Automation']")
	WebElement serviceName23;

	@FindBy(xpath = "//div[@class=\"mtm_item_name mtn_tab_caller\"][text()='Data Management & Analytics']")
	WebElement serviceName24;

	@FindBy(xpath = "//div[@class=\"mtm_item_name mtn_tab_caller\"][text()='Managed IT Services']")
	WebElement serviceName25;

	@FindBy(xpath = "//div[@class=\"mtm_item_name mtn_tab_caller\"][text()='Debt Management Solutions']")
	WebElement serviceName26;

	public void clickServiceOption() {

		clickAction(services);
	}

	public void clickServiceOption1() {

		doubleclick(serviceName1);
	}

	public void clickServiceOption2() {

		clickAction(serviceName2);
	}

	public void clickServiceOption3() {

		clickAction(serviceName3);
	}

	public void clickServiceOption4() {

		clickAction(serviceName4);
	}

	public void clickServiceOption5() {

		clickAction(serviceName5);
	}

	public void clickServiceOption6() {

		clickAction(serviceName6);
	}

	public void clickServiceOption7() {

		clickAction(serviceName7);
	}

	public void clickServiceOption8() {

		clickAction(serviceName8);
	}

	public void clickServiceOption9() {

		clickAction(serviceName9);
	}

	public void clickServiceOption10() {

		clickAction(serviceName10);
	}

	public void clickServiceOption11() {

		clickAction(serviceName11);
	}

	public void clickServiceOption12() {

		clickAction(serviceName12);
	}

	public void clickServiceOption13() {

		clickAction(serviceName13);
	}

	public void clickServiceOption14() {

		clickAction(serviceName14);
	}

	public void clickServiceOption15() {

		clickAction(serviceName15);
	}

	public void clickServiceOption16() {

		clickAction(serviceName16);
	}

	public void clickServiceOption17() {

		clickAction(serviceName17);
	}

	public void clickServiceOption18() {

		clickAction(serviceName18);
	}

	public void clickServiceOption19() {

		clickAction(serviceName19);
	}

	public void clickServiceOption20() {

		clickAction(serviceName20);
	}

	public void clickServiceOption21() {

		clickAction(serviceName21);
	}

	public void clickServiceOption22() {

		clickAction(serviceName22);
	}

	public void clickServiceOption23() {

		clickAction(serviceName23);
	}

	public void clickServiceOption24() {

		clickAction(serviceName24);
	}

	public void clickServiceOption25() {

		clickAction(serviceName25);
	}

	public void clickServiceOption26() {

		clickAction(serviceName26);
	}

}
