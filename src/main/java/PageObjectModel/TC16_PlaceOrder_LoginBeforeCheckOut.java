package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC16_PlaceOrder_LoginBeforeCheckOut {

WebDriver driver;
	
	public TC16_PlaceOrder_LoginBeforeCheckOut(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repository

	@FindBy (linkText="Signup / Login") WebElement signInBtn;
	@FindBy (xpath = "//input[@type='email'][@data-qa='login-email']") WebElement emailId;
	@FindBy (xpath="//input[@data-qa='login-password']")WebElement pass;
	@FindBy (xpath = "//button[@data-qa='login-button']") WebElement loginBtn;
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a") WebElement loginAsUsername;
	@FindBy (xpath =  "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div") WebElement firstProduct;
	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a") WebElement firstProductAddtoCart;
	@FindBy (xpath = "//button[text()='Continue Shopping']") WebElement continueShoppingBtn ;
	@FindBy (xpath = "//a[text()=' Cart']")WebElement cartBtn;
	@FindBy (xpath = "//*[@id=\"product-1\"]/td[2]/h4/a") WebElement cartProduct;
	@FindBy (xpath = "//a[@class='btn btn-default check_out']")WebElement proceedTocheckoutBtn;
	@FindBy (xpath = "//h2[text()='Address Details']")WebElement AddressDetalis;
	@FindBy (xpath = "//h2[text()='Review Your Order']")WebElement reviewYourOrderDetails;
	@FindBy (xpath = "//textarea[@class='form-control']")WebElement comment;
	@FindBy (xpath = "//a[text()='Place Order']")WebElement placeOrderBtn1;
	@FindBy (xpath = "//input[@name='name_on_card']")WebElement nameonCard;
	@FindBy (xpath = "//input[@name='card_number']")WebElement cvcNum;
	@FindBy (xpath = "//input[@class='form-control card-cvc']")WebElement cvcCardNum;
	@FindBy (xpath = "//input[@name='expiry_month']")WebElement expirationmonth;
	@FindBy (xpath = "//input[@name='expiry_year']")WebElement expirationYear;
	@FindBy (xpath = "//button[@class='form-control btn btn-primary submit-button']")WebElement payAndConfirmOrderBtn;
	@FindBy (xpath = "//p[text()='Congratulations! Your order has been confirmed!']")WebElement OrderPlacedMsg;
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")WebElement dltBtn;
	@FindBy (xpath = "//b[text()='Account Deleted!']")WebElement accDltText;
	@FindBy (xpath = "//a[@class='btn btn-primary']")WebElement continueBtn2;
	
	
	
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
		
		//click on sign in / login button
		public void clickOnSignInBtn() 
		{
			signInBtn.click();
		}
			

		//Fill email, password and click 'Login' button

		public void fillDetails (String em, String pw) 
		{
			emailId.sendKeys(em);
			pass.sendKeys(pw);
			loginBtn.click();

		}
		
		
		//verify logged in as username is visible
			public void verifyLoggedAsUsername()
			{
				WebElement verifyLoggedAsUsername = loginAsUsername;
				if(verifyLoggedAsUsername.isDisplayed())
				{
					System.out.println("'Logged in as username'is visible");
				}
				else 
				{
					System.out.println("'Logged in as username'is not visible");
				}
			}
			
		//Add products to cart
			public void addProductToCart() throws InterruptedException
			{
				Actions ac = new Actions(driver);
			    ac.moveToElement(firstProduct).perform();
			    firstProductAddtoCart.click();
				Thread.sleep(3000);
				continueShoppingBtn.click();

			}
			
		//Click 'Cart' button
			public void clickOnCartBtn()
			{
				cartBtn.click();
			}
			
		//Verify that cart page is displayed
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
			
		//Click Proceed To Checkout

			public void clickProceedToCheckout1()
			{
				proceedTocheckoutBtn.click();
			}
			
			
			//Verify Address Details and Review Your Order
			
					public void verifyAddDetailsReviewOrder()
					{
						WebElement verifyAddressDetails = AddressDetalis;
						if(verifyAddressDetails.isDisplayed())
						{
							System.out.println("Address details is visible");
						}
						else
						{
							System.out.println("Address details is not visible");
						}
						
						WebElement reviewYourOrder = reviewYourOrderDetails;
						if(reviewYourOrder.isDisplayed())
						{
							System.out.println("Review your order is display");
						}
						else 
						{
							System.out.println("Review your order is not display");
						}
						
					}	
			
					
					//Enter description in comment text area and click 'Place Order'
			
						public void enterDescriptionAndclickplaceOrder()
						{
							comment.sendKeys("blue top");
							placeOrderBtn1.click();
						}
						
					//Enter payment details: Name on Card, Card Number, CVC, Expiration date
						public void enterpaymentdetails(String name,String cardnum,String cvc, String month,String year)
						{
							nameonCard.sendKeys(name);
							cvcNum.sendKeys(cardnum);
							cvcCardNum.sendKeys(cvc);
							expirationmonth.sendKeys(month);
							expirationYear.sendKeys(year);
						}
						
					//Click 'Pay and Confirm Order' button
						public void clickOnPayAndConfirmOrderBtn()
						{
							payAndConfirmOrderBtn.click();
						}
						
					//Verify success message 'Your order has been placed successfully!'
						public void verifySuccessMsg()
						{
							WebElement verifySuccessMsg = OrderPlacedMsg;
							if(verifySuccessMsg.isDisplayed())
							{
								System.out.println("'Your order has been placed successfully!'");
							}
							else
							{
								System.out.println("'Your order has been placed successfully!' is not displayed");
							}
						}
						
					//Click 'Delete Account' button
						public void clickdltAcc()
						{
							dltBtn.click();
						}
						
					//Verify 'ACCOUNT DELETED!' and click 'Continue' button
						public void AccDltAndClickContinueeBtn()
						{
						WebElement accDeletedElement = accDltText ;
						if(accDeletedElement.isDisplayed())
						{
							System.out.println("'ACCOUNT DELETED!'is visible");
						}
						else 
						{
							System.out.println("'ACCOUNT DELETED!'is not visible");
						}
						continueBtn2.click();
						}				
	
	
	
}
