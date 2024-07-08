package PageObjectModel;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC20_SearchProductAndVerifyCartAfterLogin {

WebDriver driver;
	
	public TC20_SearchProductAndVerifyCartAfterLogin(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") WebElement productBtn ;
	@FindBy (id =  "search_product") WebElement searchBox;
	@FindBy (id =  "submit_search") WebElement searchBtn;
	@FindBy (xpath = "//h2[text()='Searched Products']") WebElement searchProductText;
	@FindBy (xpath = "//h2[text()='Searched Products']") List<WebElement> AllproductsList;
	@FindBy (xpath =  "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div") WebElement firstProduct;
	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a") WebElement firstProductAddtoCart;
	@FindBy (xpath = "//button[text()='Continue Shopping']") WebElement continueShoppingBtn ;
	@FindBy (xpath = "//a[text()=' Cart']") WebElement viewCartBtn;
	@FindBy (xpath =  "//*[@id=\"product-1\"]/td[1]/a/img") WebElement firstProductIncart;
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")WebElement signupLoginBtn;
	@FindBy (xpath = "//input[@type='email'][@data-qa='login-email']") WebElement emailId;
	@FindBy (xpath="//input[@data-qa='login-password']")WebElement pass;
	@FindBy (xpath = "//button[@data-qa='login-button']") WebElement loginBtn;
	

	//Launch browser
		public void url() throws InterruptedException
		{
			driver.get("http://automationexercise.com");
			Thread.sleep(3000);
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
	
	//Enter product name in search input and click search button
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
		

		//Add those products to cart

			public void addProductToCart() throws InterruptedException
				{
				
					Actions ac = new Actions(driver);
				    ac.moveToElement(firstProduct).perform();
				    Thread.sleep(2000);
				    firstProductAddtoCart.click();
					Thread.sleep(5000);
					continueShoppingBtn.click();

				}
				
		//Click 'Cart' button and verify that products are visible in cart
			

	     public void clickcartBtnverifyProductvisibleInCart() throws InterruptedException 
	     { 
	    	 JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scroll(0,-250)");
				
				viewCartBtn.click();
				Thread.sleep(2000);

	    	 WebElement Firstproduct = firstProductIncart;
	    	 
	    	 if(Firstproduct.isDisplayed())
	    	 {
	    		 System.out.println("product is added to cart");
	    		}
	    	 else
	    	 {
	    		 System.out.println("product is not added to cart");
	    	 }
	     }
		
	   //Click 'Signup / Login' button and submit login details
  
			public void	clickOnSignUpLoginBtnSubmitLoginDetails(String em, String pw) throws InterruptedException
			{
				signupLoginBtn.click();
				Thread.sleep(3000);
				emailId.sendKeys(em);
				pass.sendKeys(pw);
				loginBtn.click();
			}
			
		//Again, go to Cart page
			public void gotoCart()
			{
				viewCartBtn.click();

			}
			
		//Verify that those products are visible in cart after login as well
			public void verifyProductvisibleinCartAfterLogin()
			{
				 WebElement Firstproduct = firstProductIncart;
		    	 
		    	 if(Firstproduct.isDisplayed())
		    	 {
		    		 System.out.println("product is visible to cart");
		    		}
		    	 else
		    	 {
		    		 System.out.println("product is not visible to cart");
		    	 }
			}
	
}
