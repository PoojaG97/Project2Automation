package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC17_Remove_ProductFromCart {

WebDriver driver;
	
	public TC17_Remove_ProductFromCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	

	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a") WebElement ProductAddtoCart;
	@FindBy (xpath = "//button[text()='Continue Shopping']") WebElement continueShoppingBtn ;
	@FindBy (xpath =  "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div") WebElement firstProduct;
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a") WebElement cartBtn;
	@FindBy (xpath = "//*[@id=\"product-1\"]/td[2]/h4/a") WebElement cartProduct;
	@FindBy (xpath = "//i[@class='fa fa-times']")WebElement XBtn;
	@FindBy (xpath = "//b[text()='Cart is empty!']")WebElement emptyCartText;	
	
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
		
		
		
		//Add products to cart
				public void AddProductToCart() throws InterruptedException
				{
					JavascriptExecutor js =(JavascriptExecutor)driver;
					js.executeScript("window.scroll(0,250)");	
					
					Actions ac = new Actions(driver);
				    ac.moveToElement(firstProduct).perform();
				    ProductAddtoCart.click();
					Thread.sleep(2000);
					continueShoppingBtn.click();
					
				}	

		
		//Click 'Cart' button
				public void clickOnCartBtn()
				{
					cartBtn.click();
				}

		//verify that cart page is displayed
				public void verifyCartPageDisplayed()
				{
					 WebElement Firstproduct = cartProduct;
			    	 
			    	 if(Firstproduct.isDisplayed())
			    	 {
			    		 System.out.println("Cart page is displayed");
			    		}
			    	 else
			    	 {
			    		 System.out.println("Cart page is not displayed");
			    	 }
				}
				
		//Click 'X' button corresponding to particular product
				public void clickOnXBtn() throws Exception
				{
					XBtn.click();
					Thread.sleep(2000);
				}


		//Verify that product is removed from the cart
				public void verifyProductIsremovedFromCart()
				{
					 WebElement cartISemptyText = emptyCartText;
			    	 
			    	 if(cartISemptyText.isDisplayed())
			    	 {
			    		 System.out.println("Cart is Empty is displayed");
			    		}
			    	 else
			    	 {
			    		 System.out.println("Cart is Empty is not displayed");
			    	 }
				}
}
