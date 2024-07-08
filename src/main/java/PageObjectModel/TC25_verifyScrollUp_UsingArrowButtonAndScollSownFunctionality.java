package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC25_verifyScrollUp_UsingArrowButtonAndScollSownFunctionality {

	

WebDriver driver;
	
	public TC25_verifyScrollUp_UsingArrowButtonAndScollSownFunctionality(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository
	@FindBy (xpath = "//h2[text()='Subscription']") WebElement subscriptionText; 
	@FindBy (xpath = "//i[@class='fa fa-angle-up']")WebElement arrowBtn;
	@FindBy (xpath = "//h2[text()='Full-Fledged practice website for Automation Engineers']")WebElement fullFledgedText;
	

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
		
	//Scroll down page to bottom
		public void scrollDownPageToBottom()
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,7650)");
		}
	
	//Verify 'SUBSCRIPTION' is visible
		public void verifytextSubscription()
		{
			WebElement verifytextSubscription = subscriptionText;
			if(verifytextSubscription.isDisplayed())
			{
				System.out.println("'subscription' : is display");
			}
			else 
			{
				System.out.println("'subscription': is not display");
			}
			
		}
		
	//Click on arrow at bottom right side to move upward

		public void clickOnArrowBtn()
		{
			arrowBtn.click();
		}
		
	//Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
	
		public void verifyPageScrollUp()
		{
			WebElement verifyPageScrollUp = fullFledgedText;
			if(verifyPageScrollUp.isDisplayed())
			{
				System.out.println("'Full-Fledged practice website for Automation Engineers' text is visible on screen");
			}
			else 
			{
				System.out.println("'Full-Fledged practice website for Automation Engineers' text is not visible on screen");
			}
			
		}
}
