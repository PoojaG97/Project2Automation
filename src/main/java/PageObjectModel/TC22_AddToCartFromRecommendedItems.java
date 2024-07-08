package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC22_AddToCartFromRecommendedItems {


WebDriver driver;
	
	public TC22_AddToCartFromRecommendedItems(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	@FindBy (xpath = "//h2[text()='recommended items']")WebElement recommendedItemsText;
	@FindBy (xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[2]/div/div/div/a")WebElement addToCartBtn;
	@FindBy (xpath = "//u[text()='View Cart']")WebElement viewCartBtn;
	@FindBy (xpath = "//td[@class='cart_product']")WebElement productinCart;
	

	//Launch browser
		public void url() throws InterruptedException
		{
			driver.get("http://automationexercise.com");
			Thread.sleep(3000);
		}
	
	//Scroll to bottom of page
	public void scrollToBottomOfPage()
	{
		
	 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,7550)");
		
	}
	
	//Verify 'RECOMMENDED ITEMS' are visible
	public void verifyRecommendedItemsVisible() 
	{
		WebElement verifyRecommendedItemsVisible = recommendedItemsText;
		if(verifyRecommendedItemsVisible.isDisplayed())
		{
			System.out.println("'RECOMMENDED ITEMS' are visible");
		}
		else 
		{
			System.out.println("'RECOMMENDED ITEMS' are not visible");
		}
	}
	
	//Click on 'Add To Cart' on Recommended product
		public void clickOnaddToCart()
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			WebElement element = wait.until(ExpectedConditions.visibilityOf(addToCartBtn));
			addToCartBtn.click();
		}
	
	//Click on 'View Cart' button
		public void clickOnviewCartBtn() throws InterruptedException
		{
			Thread.sleep(3000);
			viewCartBtn.click();
		}
		
	//Verify that product is displayed in cart page
		public void verifyProductisDisplayedinCartPage() 
		{
			WebElement verifyProductisDisplayedinCartPage = productinCart;
			if(verifyProductisDisplayedinCartPage.isDisplayed())
			{
				System.out.println("Product is displayed in card");
			}
			else 
			{
				System.out.println("Product is not displayed in card");
			}
		}
	
	
}
