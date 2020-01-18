package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage{
	
	public ProductDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@class='socialsharing_product list-inline no-print']/button[1]")
	private WebElement btnTweet;
	
	@FindBy(xpath = "//p[@class='socialsharing_product list-inline no-print']/button[2]")
	private WebElement btnFacebook;
	
	@FindBy(xpath = "//p[@class='socialsharing_product list-inline no-print']/button[3]")
	private WebElement btnGoogle;
	
	@FindBy(xpath = "//p[@class='socialsharing_product list-inline no-print']/button[4]")
	private WebElement btnPinterest;
	
	@FindBy(id = "short_description_content")
	private WebElement pDescription;

	public WebElement getBtnTweet() {
		return btnTweet;
	}

	public WebElement getBtnFacebook() {
		return btnFacebook;
	}

	public WebElement getBtnGoogle() {
		return btnGoogle;
	}

	public WebElement getBtnPinterest() {
		return btnPinterest;
	}
	
	public WebElement getPDescription() {
		return pDescription;
	}

}
