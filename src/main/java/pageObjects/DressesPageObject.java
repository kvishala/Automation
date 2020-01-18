package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObject extends BasePage {
	
	public DressesPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[1]//a")
	private WebElement chkBoxSizeS;
	
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]//a")
	private WebElement chkBoxSizeM;
	
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[3]//a")
	private WebElement chkBoxSizeL;
	
	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement txtCount;
	
	@FindBys(value = { @FindBy(xpath = "//*[@class='product_list grid row']/li")})
	private List<WebElement> productList;
	
	@FindBy(xpath = "//*[@class='product_list grid row']/li[1]//div[@class='right-block']//a[contains(@title,'cart')]")
	private WebElement btnFstPrdtAddToCart;
	
	@FindBy(xpath = "//*[@class='product_list grid row']/li[1]//div[@class='right-block']//a[@title='View']")
	private WebElement btnFstPrdtMore;
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]")
	private WebElement cartMsgWindow;
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
	private WebElement txtSuccessMsg;
	
	@FindBy(className = "cross")
	private WebElement cartMsgWndwClose;
	
	public WebElement getChkBoxSizeS() {
		return chkBoxSizeS;
	}
	
	public WebElement getChkBoxSizeM() {
		return chkBoxSizeM;
	}
	
	public WebElement getChkBoxSizeL() {
		return chkBoxSizeL;
	}
	
	public WebElement getTxtCount() {
		return txtCount;
	}
	
	public String getProductListSize() {
		Integer size = productList.size();
		return size.toString();
	}
	
	public WebElement getFirstProduct() {
		return productList.get(0);
	}
	
	public WebElement getBtnFstPrdtAddToCart() {
		return btnFstPrdtAddToCart;
	}
	
	public WebElement getBtnFstPrdtMore() {
		return btnFstPrdtMore;
	}
	
	public WebElement getCartMsgWindow() {
		return cartMsgWindow;
	}
	
	public WebElement getTxtSuccessMsg() {
		return txtSuccessMsg;
	}
	
	public WebElement getCartMsgWndwClose() {
		return cartMsgWndwClose;
	}

}
