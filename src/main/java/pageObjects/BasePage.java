package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	public String browser = "chrome";
	
	public BasePage() {
		
		if(driver == null) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equals("firefox")) {
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
		
	}
	
	public boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public void setText(WebElement element, String text) {
		if(text != null) {
			element.click();
			element.clear();
			element.sendKeys(text);
		}
	}
	
	public String getTextAttribute(WebElement element) {
		return element.getAttribute("value");
	}
	
	public String selectFromDropDown(WebElement element, String option) {
		Select obj = new Select(element);
		obj.selectByValue(option);
		return obj.getFirstSelectedOption().getText();
	}
	
	public boolean isElementVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
    	action.moveToElement(element).build().perform();
	}
	
	public void quitDriver() {
		driver.quit();
	}

}
