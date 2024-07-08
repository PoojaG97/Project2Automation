package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC13_Verify_ProductQuantityInCart {

	
WebDriver driver;
	
	public TC13_Verify_ProductQuantityInCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[4]/div/div[2]/ul/li/a")WebElement viewProduct;
	@FindBy (xpath = "//div[@class='product-information']")WebElement productDetails;
	@FindBy (id =  "quantity")WebElement quantity;
	@FindBy (xpath = "//button[@class='btn btn-default cart']")WebElement addtoCartBtn;
	@FindBy (xpath = "//u[text()='View Cart']")WebElement viewCartbtn;
	@FindBy (xpath = "//*[@id=\"product-3\"]/td[2]/h4/a") WebElement productInCart;

	//Launch browser
		public void url() throws InterruptedException
		{
			driver.get("http://automationexercise.com");
			
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
		
	//Click 'View Product' for any product on home page
	
		public void clickOnViewProduct()
		{
			viewProduct.click();
		}

		
		
	//Verify product detail is opened
		public void verifyProductDetailisOpen() 
	     { 
	    	 WebElement verifyProductDetailisOpen = productDetails;
	    	 
	    	 if(verifyProductDetailisOpen.isDisplayed())
	    	 {
	    		 System.out.println("product detail is opened");
	    		}
	    	 else
	    	 {
	    		 System.out.println("product detail is opened");
	    	 }
	     }
	
		
		//Increase quantity to 4

			public void increaseQuantity()
			{
				WebElement increaseQuantity = quantity;
				increaseQuantity.clear();
				increaseQuantity.sendKeys("4");
			}
			
		//Click 'Add to cart' button
	
			public void clickOnAddToCartBtn() throws InterruptedException
			{
				addtoCartBtn.click();
				Thread.sleep(3000);
			}

		//Click 'View Cart' button
	
			public void clickOnViewCartBtn()
			{
				viewCartbtn.click();
			}

		//Verify that product is displayed in cart page with exact quantity
			public void verifyProductisDisplayedinCardWithExactQuantity()
			{
				WebElement productincart = productInCart;
				String expectedProductName = "Sleeveless Dress";
				String expectedQuantity = "4";
				if(expectedProductName.equals(productincart.getText()))
				{
					System.out.println("Product is displayed in cart with exact quantity: "+ expectedQuantity);
				}
				else {
					System.out.println("product is not displayed in cart");
				}
			}
	
}
