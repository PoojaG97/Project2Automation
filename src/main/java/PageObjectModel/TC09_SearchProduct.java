package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC09_SearchProduct {
	

WebDriver driver;
	
	public TC09_SearchProduct(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	//Repository
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") WebElement productBtn ;
	@FindBy (id =  "search_product") WebElement searchBox;
	@FindBy (id =  "submit_search") WebElement searchBtn;
	@FindBy (xpath = "//h2[text()='Searched Products']") WebElement searchProductText;
	@FindBy (className = "product-container") List<WebElement> AllproductsList;

	//Launch browser
		public void url() throws InterruptedException
		{
			driver.get("http://automationexercise.com");
			Thread.sleep(3000);
		}

		//Verify that home page is visible successfully
		public void verifyHomePage()
		{
			if(driver.getTitle().equals("Automation Exercise"))
			{
				System.out.println("Title matched");
			}
				else 
				{
				System.out.println("Title not matched");
				System.out.println(driver.getTitle());
				}
		}
		
	//click on Product button
		public void clickOnproductBtn()
		{
			productBtn.click();
		}
	
	// Verify user is navigated to  ALL PRODUCTS page successfully
		
		public void verifyAllproductPageVisible() 
		{
			if(driver.getTitle().equals("Automation Exercise - All Products"))
			{
				System.out.println("Title matched:Automation Exercise - All Products");
			}
				else 
				{
				System.out.println("Title not matched");
				System.out.println(driver.getTitle());
				}
		}
	
	// Enter product name in search input and click search button
		
		public void enterProductAndClickSearchBtn(String pd)
		{
			searchBox.sendKeys(pd);
			searchBtn.click();
			
		}
		
	//Verify 'SEARCHED PRODUCTS' is visible
		public void verifySearchproductVisible()
		{
			WebElement verifySearchproductVisible = searchProductText;
			if(verifySearchproductVisible.isDisplayed())
			{
				System.out.println("'SEARCHED PRODUCTS'is visible");
			}
			else 
			{
				System.out.println("'SEARCHED PRODUCTS'is not visible");
			}
		}
		
		
	// Verify all the products related to search are visible
		public void verifyAllProductArevisible()
		{
			List<WebElement> verifyAllProductArevisible = AllproductsList;
	        for (WebElement item : verifyAllProductArevisible) {
	            if (item.isDisplayed()) {
	                System.out.println("Product item is visible.");
	            } else {
	                System.out.println("Product item is not visible.");
	            }
	        }
		}
}
