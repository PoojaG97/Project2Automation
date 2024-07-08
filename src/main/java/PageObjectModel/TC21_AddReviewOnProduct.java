package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC21_AddReviewOnProduct {
	

WebDriver driver;
	
	public TC21_AddReviewOnProduct(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") WebElement productBtn ;
	@FindBy (xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")WebElement viewProductBTn;
	@FindBy (xpath = "//a[text()='Write Your Review']")WebElement writeReviewText;
	@FindBy (xpath = "//input[@id='name']")WebElement yourname;
	@FindBy (xpath = "//input[@id='email']")WebElement email;
	@FindBy (xpath = "//textarea[@id='review']")WebElement reviewBox;
	@FindBy (xpath = "//button[@id='button-review']")WebElement submitBtn;
	@FindBy (xpath = "//span[text()='Thank you for your review.']")WebElement successMsgText;
	
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
		
	//Click on 'View Product' button
		public void clickOnViewProductBtn()
		{
			viewProductBTn.click();
		}
		
	//Verify 'Write Your Review' is visible
		public void verifyWriteYourReviewVisible()
		{
			WebElement verifyWriteYourReviewVisible = writeReviewText;
			if(verifyWriteYourReviewVisible.isDisplayed())
			{
				System.out.println("'Write Your Review' is visible");
			}
			else 
			{
				System.out.println("'Write Your Review' is not visible");
			}
		}
		
	//Enter name, email and review
		public void enterNameEmailReview(String nm, String em, String review)
		{
			yourname.sendKeys(nm);
			email.sendKeys(em);
			reviewBox.sendKeys(review);
		}
	
	//Click 'Submit' button
		public void clickOnSubmitBtn()
		{
			submitBtn.click();
		}
	
	//Verify success message 'Thank you for your review.'
		public void verifySuccessMsg()
		{
			WebElement verifySuccessMsg = successMsgText;
			if(verifySuccessMsg.isDisplayed())
			{
				System.out.println("'Thank you for your review.' is visible");
			}
			else 
			{
				System.out.println("'Thank you for your review.' is not visible");
			}
		}
		
}
