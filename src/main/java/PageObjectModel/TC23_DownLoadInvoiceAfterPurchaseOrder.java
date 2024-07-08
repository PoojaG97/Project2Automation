package PageObjectModel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC23_DownLoadInvoiceAfterPurchaseOrder {

	
	
	
WebDriver driver;
	
	public TC23_DownLoadInvoiceAfterPurchaseOrder(WebDriver idriver)
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
	@FindBy (xpath = "//a[@class='btn btn-default check_out']")WebElement proceedTocheckoutBtn;
	@FindBy (xpath = "//u[text()='Register / Login']")WebElement registerLoginBtn;
	@FindBy (xpath = "//input[@name='name']")WebElement name;
	@FindBy (xpath = "//input[@name='email'][@data-qa='signup-email']")WebElement email;
	@FindBy (xpath = "//button[@class='btn btn-default'][@data-qa='signup-button']")WebElement signUpBtn;
	@FindBy (id  = "id_gender2")WebElement selectGender;
	@FindBy (xpath = "//input[@id='password']")WebElement pass;
	@FindBy (id  = "days")WebElement day;
	@FindBy (id  = "months")WebElement month;
	@FindBy (id  = "years")WebElement year;
	@FindBy (xpath = "//input[@name='newsletter']")WebElement checkbox1;
	@FindBy (xpath = "//input[@name='optin']")WebElement checkbox2;
	@FindBy (xpath = "//input[@id='first_name']")WebElement firstname;
	@FindBy (xpath = "//input[@id='last_name']")WebElement lastname;
	@FindBy (xpath = "//input[@id='company']")WebElement company;
	@FindBy (xpath = "//input[@id='address1']")WebElement address;
	@FindBy (xpath = "//input[@id='address2']")WebElement address2;
	@FindBy (xpath = "//select[@id='country']")WebElement country;
	@FindBy (xpath = "//input[@id='state']")WebElement state;
	@FindBy (xpath = "//input[@id='city']")WebElement city;
	@FindBy (xpath = "//input[@id='zipcode']")WebElement zipcode;
	@FindBy (xpath = "//input[@id='mobile_number']")WebElement mobileNumber;
	@FindBy (xpath = "//button[@class='btn btn-default'][@data-qa='create-account']")WebElement createAccBtn;
	@FindBy (xpath = "//b[text()='Account Created!']")WebElement accCreated;
	@FindBy (xpath = "//a[@class='btn btn-primary']") WebElement continueBtn;
	@FindBy (xpath = "//div[@class='col-sm-8']/child::div/child::ul/child::li[10]/child::a")WebElement loggedInUsername;
	@FindBy (xpath = "//h2[text()='Address Details']")WebElement AddressDetalis;
	@FindBy (xpath = "//h2[text()='Review Your Order']")WebElement reviewYourOrderDetails;
	@FindBy (xpath = "//textarea[@class='form-control']")WebElement comment;
	@FindBy (xpath = "//a[text()='Place Order']")WebElement placeOrderBtn1;
	@FindBy (xpath = "//input[@name='name_on_card']")WebElement nameonCard;
	@FindBy (xpath = "//input[@name='card_number']")WebElement cvcNum;
	@FindBy (xpath = "//input[@name='expiry_month']")WebElement expirationmonth;
	@FindBy (xpath = "//input[@name='expiry_year']")WebElement expirationYear;
	@FindBy (xpath = "//button[@class='form-control btn btn-primary submit-button']")WebElement payAndConfirmOrderBtn;
	@FindBy (xpath = "//p[text()='Congratulations! Your order has been confirmed!']")WebElement OrderPlacedMsg;
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")WebElement dltBtn;
	@FindBy (xpath = "//b[text()='Account Deleted!']")WebElement accDltText;
	@FindBy (xpath = "//a[@class='btn btn-primary']")WebElement continueBtn2;
	@FindBy (xpath = "//input[@class='form-control card-cvc']")WebElement cvcCardNum;
	@FindBy (xpath = "//a[text()='Download Invoice']")WebElement downloadInvoiceBtn;
	
	//Launch browser
			public void url() throws InterruptedException
			{
				driver.get("http://automationexercise.com");
				Thread.sleep(1000);
				driver.manage().window().maximize();
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

		//Click Proceed To Checkout
				public void clickProceedToCheckout()
				{
					proceedTocheckoutBtn.click();
				}
				
		//Click 'Register / Login' button
				public void clickRegisterLoginBtn()
				{
					registerLoginBtn.click();
				}	

		//Fill all details in Signup and create account

				public void fillDetailsInSignUp() throws AWTException
				{
					name.sendKeys("pooja");
					email.sendKeys("pooja3@gmail.com");
					signUpBtn.click();
					
					selectGender.click();
					pass.sendKeys("pooja123");
					
					JavascriptExecutor js =(JavascriptExecutor)driver;
					js.executeScript("window.scroll(0,250)");	
					
					day.sendKeys("12");
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
					
					Select st1 = new Select(month);
					st1.selectByVisibleText("March");
					Select st2 = new Select(year);
					st2.selectByValue("1997");
					
					checkbox1.click();
					checkbox2.click();
					
					firstname.sendKeys("pooja");
					lastname.sendKeys("g");
					company.sendKeys("ExcelR");
					address.sendKeys("pune");
					address2.sendKeys("pune");

					Select st3 = new Select(country);
					st3.selectByVisibleText("India");
					
					state.sendKeys("maharashtra");
					city.sendKeys("yavatmal");
					zipcode.sendKeys("445001");
					mobileNumber.sendKeys("7744013001");
					createAccBtn.click();
							
				}
				
			//verify acc created visible and click on continue button

				public void verifyAccCreatedAndClickCountinueBtn()
				{
				WebElement accCreatedElement = accCreated;
				if(accCreatedElement.isDisplayed())
				{
					System.out.println("'ACCOUNT CREATED!'is visible");
				}
				else 
				{
					System.out.println("'ACCOUNT CREATED!'is not visible");
				}
				continueBtn.click();
				}
				
		//verify Logged in as username is visible at top
				public void verifyLoggedInasUsernameVisible()
				{
	
					
				WebElement verifyLoggedInasUsernameVisible = loggedInUsername;
				if(verifyLoggedInasUsernameVisible.isDisplayed())
				{
					System.out.println("'Logged in as pooja'is visible");
				}
				else 
				{
					System.out.println("'Logged in as pooja'is not visible");
				}
				}
				
			//Click 'Cart' button
				public void clickOnCartBtn1()
				{
					cartBtn.click();
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
				
			//Click 'Download Invoice' button and verify invoice is downloaded successfully.
				
				public void ClickdownLoadInvoiceBtnverifyInvoiceDownloaded()
				{
					downloadInvoiceBtn.click();
					
					
				}
				
				
				//Click 'Continue' button	
				
			//Click 'Delete Account' button
				public void dltAcc()
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
