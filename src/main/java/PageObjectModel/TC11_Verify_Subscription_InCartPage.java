package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC11_Verify_Subscription_InCartPage {

WebDriver driver;
	
	public TC11_Verify_Subscription_InCartPage(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	//Repository
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")WebElement cartBtn;
	@FindBy (xpath = "//h2[text()='Subscription']") WebElement subscriptionText; 
	@FindBy (id =  "susbscribe_email") WebElement textBoxEmail ; 
	@FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']") WebElement arrowBtn ; 
	@FindBy (xpath =  "//div[@class='alert-success alert']") WebElement successMsgText ; 
	
	
	
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
			
			//Click 'Cart' button
			public void clickOnCartBtn()
			{
				cartBtn.click();
			}
			
			
		//Scroll down to footer
			public void scrollDown() 
			{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,50)");
			}
			
		//Verify text 'SUBSCRIPTION'
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
			
			//Enter email address in input and click arrow button

			public void enterEmailAndClickArrow(String em) throws InterruptedException
			{
				Thread.sleep(3000);
				textBoxEmail.sendKeys(em);
				arrowBtn.click();
			}
			
			// Verify success message 'You have been successfully subscribed!' is visible

			public void verifySuccessMsg() 
			{
				WebElement verifySuccessMsg = successMsgText;
				if(verifySuccessMsg.isDisplayed())
				{
					System.out.println("'You have been successfully subscribed!' : is display");
				}
				else 
				{
					System.out.println("'You have been successfully subscribed!': is not display");
				}
				
			}
}

