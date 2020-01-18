package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DressesPageObject;
import pageObjects.HomePageObject;

public class DressesPageTest {
	
	DressesPageObject dressPage;
	HomePageObject homePage;
	
	public DressesPageTest() {
		homePage = new HomePageObject();
		homePage.getLnkTxtDresses().click();
		dressPage = new DressesPageObject();
	}
	
	@Test
	public void verifyChkBoxSizeS() {
		Assert.assertTrue(dressPage.elementFound(dressPage.getChkBoxSizeS()), "Failed: size S not found");
	}
	
	@Test
	public void verifyChkBoxSizeM() {
		Assert.assertTrue(dressPage.elementFound(dressPage.getChkBoxSizeM()), "Failed: size M not found");
	}
	
	@Test
	public void verifyChkBoxSizeL() {
		Assert.assertTrue(dressPage.elementFound(dressPage.getChkBoxSizeL()), "Failed: size L not found");
	}
	
	@Test
	public void verifyMatchingResult() {
		Assert.assertTrue(dressPage.getTxtCount().getText().contains(dressPage.getProductListSize()), "Failed: Count Mismatch");
	}
	
	@Test
	public void verifyProductAddedToCart() {
		dressPage.moveToElement(dressPage.getFirstProduct());
		dressPage.getBtnFstPrdtAddToCart().click();
		dressPage.isElementVisible(dressPage.getCartMsgWindow());
		String msg = dressPage.getTxtSuccessMsg().getText();
		Assert.assertTrue(msg.contains("Product successfully added"), "Failed: Product not added to cart");
		dressPage.getCartMsgWndwClose().click();
	}

}
