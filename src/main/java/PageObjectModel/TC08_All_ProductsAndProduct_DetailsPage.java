package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC08_All_ProductsAndProduct_DetailsPage {

WebDriver driver;
	
	public TC08_All_ProductsAndProduct_DetailsPage(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") WebElement productBtn ;
	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a") WebElement viewProductText;
	@FindBy (xpath = "//h2[text()='Blue Top']") WebElement productName ;
	@FindBy (xpath = "//p[text()='Category: Women > Tops']") WebElement category ;
	@FindBy (xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span") WebElement priceDetails;
	@FindBy (xpath =  "//b[text()='Availability:']") WebElement availabilityText;
	@FindBy (xpath =  "//b[text()='Condition:']") WebElement condition ;
	@FindBy (xpath =  "//b[text()='Brand:']") WebElement brand;
	
	

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
	
	//Click on 'View Product' of first product			
		
		public void clickOnViewproductBtn()
			{
				viewProductText.click();
			}
		
		
		//Verify that detail detail is visible: product name, category, price, availability, condition, brand

			public void verifyProductDetailsVisible() 
			{
				WebElement verifyProduct = productName ;
				WebElement verifycategory = category ;
				WebElement verifypriceDetails = priceDetails ;
				WebElement verifyavailabilityText = availabilityText ;
				WebElement verifycondition = condition;
				WebElement verifybrand= brand;
				
				if(verifyProduct.isDisplayed()
						&& verifycategory.isDisplayed() 
						&& verifypriceDetails.isDisplayed()
						&& verifyavailabilityText.isDisplayed()
						&& verifycondition.isDisplayed()
						&& verifybrand.isDisplayed()) 
				{
					System.out.println("All product details is visible");
				}
				else
				{
					System.out.println("product details are not visible");
				}
			}
}
