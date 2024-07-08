package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC05_Register_User_WithExistingEmail {


	WebDriver driver;
	
	public TC05_Register_User_WithExistingEmail(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repository
	
	@FindBy (linkText="Signup / Login") WebElement signInBtn;
	@FindBy (xpath= "//h2[text()='New User Signup!']") WebElement NewUserSignupText;
	@FindBy (xpath = "//input[@name='name']") WebElement name;
	@FindBy (xpath="//input[@name='email'][@data-qa='signup-email']")WebElement email;
	@FindBy (xpath = "//button[@class='btn btn-default'][@data-qa='signup-button']") WebElement signUpBtn;
	@FindBy (xpath = "//p[text()='Email Address already exist!']") WebElement emailAlreadyExistText;
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
	
	//verify New User signup
		public void verifyNewUserSignupText()
		{
			WebElement verifyNewUserSignupText = NewUserSignupText;
			if(verifyNewUserSignupText.isDisplayed())
			{
				System.out.println("'New User Signup!'is visible");
			}
			else 
			{
				System.out.println("'New User Signup!'is not visible");
			}
		}
		
		//Enter name
		public void enterName (String nm) 
		{
			name.sendKeys(nm);
		}
		
		//Enter email
			public void enterEmail (String em) 
			{
				email.sendKeys(em);
			}
		
	//click on signup button
		public void clickOnSignUpBtn()
		{
			signUpBtn.click();
		}
		
	// Verify error 'Email Address already exist!' is visible
		public void verifyEmailAlreadyExistText()
		{
			WebElement verifyEmailAlreadyExistText = emailAlreadyExistText;
			if(verifyEmailAlreadyExistText.isDisplayed())
			{
				System.out.println("'Email Address already exist!'is visible");
			}
			else 
			{
				System.out.println("'Email Address already exist!'is not visible");
			}
		}
}
