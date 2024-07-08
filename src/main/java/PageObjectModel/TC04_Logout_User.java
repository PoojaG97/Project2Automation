package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC04_Logout_User {
	
WebDriver driver;
	
	public TC04_Logout_User(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repository
	
	@FindBy (linkText="Signup / Login") WebElement signInBtn;
	@FindBy (xpath= "//h2[text()='Login to your account']") WebElement LoginAccText;
	@FindBy (xpath = "//input[@type='email'][@data-qa='login-email']") WebElement emailId;
	@FindBy (xpath="//input[@data-qa='login-password']")WebElement pass;
	@FindBy (xpath = "//button[@data-qa='login-button']") WebElement loginBtn;
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a") WebElement loginAsUsername;
	@FindBy (xpath = "//i[@class='fa fa-lock']") WebElement logInBtn;
	
	
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
	 
	//verify Login to acc is visible
	public void verifyLoginToAcc() 
	{
		WebElement verifyLoginToAcc = LoginAccText;
		if(verifyLoginToAcc.isDisplayed())
		{
			System.out.println("'Login to your account'is visible");
		}
		else 
		{
			System.out.println("'Login to your account'is not visible");
		}
	}
	
	//Enter Email
	public void enterEmail (String em) 
	{
		emailId.sendKeys(em);
	}
	
	//Enter password
		public void enterPassword (String pw) 
		{
			pass.sendKeys(pw);
		}
		
	//click on login
		public void clickOnLoginBtn()
		{
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
		
	//Click 'Logout' button
		 public void clickOnLogout()
		 {
			 logInBtn.click();
		 }

	//Verify that user is navigated to login page
		 public void verifyUserNavigateToLoginPage()
		 {
			 if(driver.getTitle().equals("Automation Exercise - Signup / Login"))
				{
					System.out.println("Title matched");
				}
					else 
					{
					System.out.println("Title not matched");
					System.out.println(driver.getTitle());
					}
		 }
		 
}
