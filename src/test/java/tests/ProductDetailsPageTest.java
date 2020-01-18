package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DressesPageObject;
import pageObjects.HomePageObject;
import pageObjects.ProductDetailsPage;

public class ProductDetailsPageTest {
	
	HomePageObject homePage;
	DressesPageObject dressPage;
	ProductDetailsPage prdtDtsPage;
	
	public ProductDetailsPageTest() {
		homePage = new HomePageObject();
		homePage.getLnkTxtDresses().click();
		
		dressPage = new DressesPageObject();
		dressPage.moveToElement(dressPage.getFirstProduct());
		dressPage.getBtnFstPrdtMore().click();
		
		prdtDtsPage = new ProductDetailsPage();
	}
	
	@Test
	public void verifyTweetBtn() {
		Assert.assertTrue(prdtDtsPage.elementFound(prdtDtsPage.getBtnTweet()), "Failed: Tweet button is not found");
	}
	
	@Test
	public void verifyFacebookBtn() {
		Assert.assertTrue(prdtDtsPage.elementFound(prdtDtsPage.getBtnFacebook()), "Failed: Facebook button is not found");
	}
	
	@Test
	public void verifyGoogleBtn() {
		Assert.assertTrue(prdtDtsPage.elementFound(prdtDtsPage.getBtnGoogle()), "Failed: Google button is not found");
	}
	
	@Test
	public void verifyPinterestBtn() {
		Assert.assertTrue(prdtDtsPage.elementFound(prdtDtsPage.getBtnPinterest()), "Failed: Pinterest button is not found");
	}
	
	@Test
	public void verifyDescription() {
		Assert.assertTrue(prdtDtsPage.elementFound(prdtDtsPage.getPDescription()), "Failed: Description is not found");
	}

}
