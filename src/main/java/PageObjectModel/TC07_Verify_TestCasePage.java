package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC07_Verify_TestCasePage {
	
WebDriver driver;
	
	public TC07_Verify_TestCasePage(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	//repo
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")WebElement testCaseBtn ;
	@FindBy (xpath = "//b[text()='Test Cases']") WebElement testCaseText;
	
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
		
	//click on test case button
		public void clickOnTestCaseBtn()
		{
			testCaseBtn.click();
		}
	
	// Verify user is navigated to test cases page successfully
		
		public void verifyTestCasePageVisible() 
		{
			WebElement verifyTestCasePageVisible = testCaseText;
			if(verifyTestCasePageVisible.isDisplayed())
			{
				System.out.println("'Test case page 'is visible");
			}
			else 
			{
				System.out.println("'Test case page'is not visible");
			}
		}
	
}
