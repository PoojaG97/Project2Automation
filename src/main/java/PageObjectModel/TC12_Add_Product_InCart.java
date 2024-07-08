package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC12_Add_Product_InCart {
	
	
WebDriver driver;
	
	public TC12_Add_Product_InCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") WebElement productBtn ;
	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a") WebElement firstProductAddtoCart;
	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a") WebElement secondProductAddtoCart ;
	@FindBy (xpath = "//button[text()='Continue Shopping']") WebElement continueShoppingBtn ;
	@FindBy (xpath = "//u[text()='View Cart']") WebElement viewCartBtn;
	@FindBy (xpath =  "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div") WebElement firstProduct;
	@FindBy (xpath =  "/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]") WebElement secondProduct ;
	@FindBy (xpath =  "//*[@id=\"product-1\"]/td[1]/a/img") WebElement firstProductIncart;
	@FindBy (xpath =  "//*[@id=\"product-2\"]/td[1]/a/img") WebElement secondProductIncart;
	@FindBy (xpath = "//div[@id='cart_info']")WebElement cartInfo;

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
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,350)");	
		}
		
	//Hover over first product and click 'Add to Cart'
		public void firstProductAddToCart() throws InterruptedException
		{
			Actions ac = new Actions(driver);
		    ac.moveToElement(firstProduct).perform();
		    firstProductAddtoCart.click();
			Thread.sleep(5000);
		}
		
	//click continue shopping button
		public void clickOnContinueShoppingBtn()
		{
			continueShoppingBtn.click();
		}
	
	//Hover over second product and click 'Add to Cart'
			public void secondProductAddToCart() throws InterruptedException
			{
				Actions ac1 = new Actions(driver);
			    ac1.moveToElement(secondProduct).perform();
			    secondProductAddtoCart.click();
				Thread.sleep(5000);
			}

				
	//click view cart button
			public void clickOnViewCartBtn()
				{
				viewCartBtn.click();
				}
			
	// Verify both products are added to Cart
	     public void verifyProductsAddedToCart() 
	     { 
	    	 WebElement Firstproduct = firstProductIncart;
	    	 WebElement SecondProduct = secondProductIncart;
	    	 
	    	 if(Firstproduct.isDisplayed()
	    		&& SecondProduct.isDisplayed() )
	    	 {
	    		 System.out.println("Both product are added to cart");
	    		}
	    	 else
	    	 {
	    		 System.out.println("Both product are not added to cart");
	    	 }
	     }
	     
	    //Verify their prices, quantity and total price
	     public void verifypriceQuantityandatotalprice()
	     {
	    	 WebElement cartdetalis =cartInfo;
	    	 if(cartdetalis.isDisplayed()) {
	    		 String s = cartdetalis.getText();
	    		 System.out.println(s);
	    	 }
	     }
	    
				
}
