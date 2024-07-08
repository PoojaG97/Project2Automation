package TestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_RegisterUser {
	

	WebDriver driver;
	@BeforeTest
	public void tc1() throws Exception {
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.navigate().to("http://automationexercise.com");
			
		 //verify home page 
			if(driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Title matched");
			}
			else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
			}
		//click on signup/login	
		driver.findElement(By.linkText("Signup / Login")).click();
		
		//verify New User signup

		WebElement newUserSignupElement = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
		if(newUserSignupElement.isDisplayed())
		{
			System.out.println("'New User Signup!'is visible");
		}
		else 
		{
			System.out.println("'New User Signup!'is not visible");
		}
		
		//Enter name & email
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@name='email'][@data-qa='signup-email']")).sendKeys("pooja11girpunje@gmai.com");
		driver.findElement(By.xpath("//button[@class='btn btn-default'][@data-qa='signup-button']")).click();
	}
	
	@Test
		public void tc02() throws Exception {
		
		//verify Enter Acc Info is visible
		WebElement accInfoElement = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		if(accInfoElement.isDisplayed())
		{
			System.out.println("'Enter Account Information'is visible");
		}
		else 
		{
			System.out.println("'Enter Account Information'is not visible");
		}
		
		//fill details
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pooja@123");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,250)");	
		
		//Select st = new Select(driver.findElement(By.id("uniform-days")));
		//st.selectByValue("12");
		driver.findElement(By.id("days")).sendKeys("12");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Select st1 = new Select(driver.findElement(By.id("months")));
		st1.selectByVisibleText("March");
		Select st2 = new Select(driver.findElement(By.id("years")));
		st2.selectByValue("1997");
		
		//select check box
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='optin']")).click();
		
		//fill details 2
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Girpunje");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Excelr");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("mumbai");
		
		Select st3 = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		st3.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Yavatmal");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("445001");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("7744013001");
		driver.findElement(By.xpath("//button[@class='btn btn-default'][@data-qa='create-account']")).click();
		
		//verify acc created visible
		WebElement accCreatedElement = driver.findElement(By.xpath("//b[text()='Account Created!']"));
		if(accCreatedElement.isDisplayed())
		{
			System.out.println("'ACCOUNT CREATED!'is visible");
		}
		else 
		{
			System.out.println("'ACCOUNT CREATED!'is not visible");
		}
		//click on continue button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		//verify Logged in as username is visible
		WebElement loggedInUsernameElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
		if(loggedInUsernameElement.isDisplayed())
		{
			System.out.println("'Logged in as pooja'is visible");
		}
		else 
		{
			System.out.println("'Logged in as pooja'is not visible");
		}
		
		//click delete acc
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
	}
	@AfterTest
	public void tc03() {
		//verify acc deleted is visible
		WebElement accDeletedElement = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
		if(accDeletedElement.isDisplayed())
		{
			System.out.println("'ACCOUNT DELETED!'is visible");
		}
		else 
		{
			System.out.println("'ACCOUNT DELETED!'is not visible");
		}
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.close();
		
}
	
}