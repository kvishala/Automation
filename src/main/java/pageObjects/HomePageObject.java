package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Women")
	private WebElement lnkTxtWomen;
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement lnkTxtDresses;
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement lnkTxtTShirts;
	
	@FindBy(id = "newsletter-input")
	private WebElement txtBoxEMail;
	
	@FindBy(name = "submitNewsletter")
	private WebElement btnSubmit;
	
	@FindBy(className = "alert")
	private WebElement pAlertMsg;
	
	public WebElement getLnkTxtWomen() {
		return lnkTxtWomen;
	}
	
	public WebElement getLnkTxtDresses() {
		return lnkTxtDresses;
	}
	
	public WebElement getlnkTxtTShirts() {
		return lnkTxtTShirts;
	}
	
	public WebElement getPAlertMsg() {
		return pAlertMsg;
	}
	
	public void subscribe(String email) {
		setText(txtBoxEMail, email);
		btnSubmit.click();
	}


}
