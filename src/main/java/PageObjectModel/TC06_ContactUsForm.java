package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC06_ContactUsForm {
	
	
WebDriver driver;
	
	public TC06_ContactUsForm(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	//repo
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")WebElement contactUsBtn ;
	@FindBy (xpath = "//h2[text()='Get In Touch']") WebElement getInTouchText;
	@FindBy (xpath = "//input[@name='name']")WebElement nameBox;
	@FindBy (xpath = "//input[@name='email']")WebElement emailBox;
	@FindBy (xpath = "//input[@name='subject']")WebElement subjectBox;
	@FindBy (xpath = "//textarea[@name='message']")WebElement MsgAreaBox;
	@FindBy (xpath = "//input[@name='upload_file']")WebElement fileuploadarea;
	@FindBy (xpath = "//input[@name='submit']")WebElement submitBtn;
	@FindBy (xpath = "//div[@class='status alert alert-success']")WebElement successMsg;
	@FindBy (xpath = "//a[@class='btn btn-success']")WebElement homeBtn;
	
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

		
	//Click on 'Contact Us' button
		public void clickOnContactUs()
		{
			contactUsBtn.click();
		}
	//Verify 'GET IN TOUCH' is visible
		
		public void verifyGetInTouchVisible() 
		{
			WebElement verifyGetInTouchVisible = getInTouchText;
			if(verifyGetInTouchVisible.isDisplayed())
		{
				System.out.println("'GET IN TOUCH'is visible");
			}
			else 
			{
				System.out.println("'GET IN TOUCH'is not visible");
			}
		}
		
	//Enter name, email, subject and message
		public void enterNameEmailSubjectMsg()
		{
			nameBox.sendKeys("pooja");
			emailBox.sendKeys("pooja@gmail.com");
			subjectBox.sendKeys("delivery date");
			MsgAreaBox.sendKeys("Not getting any update");
		}
		
	//Upload file
		
		public void uploadFile()
		{
			WebElement fileInpute = fileuploadarea;
			fileInpute.sendKeys("C:\\\\Users\\\\91774\\\\Downloads\\\\download.jpg");
			System.out.println("File Uploaded");
		}
		
	//Click 'Submit' button
		
		public void clickOnSubmit()
		{
			submitBtn.click();
		}
		
	//Click OK button
		
		public void clickOnOK()
		{
			Alert a = driver.switchTo().alert();
			 a.accept();
		}
	//Verify success message 'Success! Your details have been submitted successfully.' is visible
		
		public void verifySuccessMsgVisible() 
		{
			WebElement verifySuccessMsgVisible = successMsg;
			if(verifySuccessMsgVisible.isDisplayed())
		{
				System.out.println("'Success! Your details have been submitted successfully.' is visible");
			}
			else 
			{
				System.out.println("'Success! Your details have been submitted successfully.' not is visible");
			}
		}
		
	//Click 'Home' button and verify that landed to home page successfully	

		public void clickOnHome() 
		{
			homeBtn.click();
			
			if(driver.getTitle().equals("Automation Exercise"))
			{
				System.out.println("landed to home page successfully");
			}
				else 
				{
				System.out.println("Not landed to home page successfully");
				}
			
		}
}
