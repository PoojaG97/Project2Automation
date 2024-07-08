package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC19_ViewCartBrandProduct {
	
	

WebDriver driver;
	
	public TC19_ViewCartBrandProduct(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	@FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") WebElement productBtn ;
	@FindBy (xpath = "//h2[text()='Brands']")WebElement brandsText;
	@FindBy (xpath = "//a[text()='H&M']")WebElement brandnameHM;
	@FindBy (xpath = "//h2[text()='Brand - H&M Products']")WebElement brandPageText;
	@FindBy (xpath = "//a[text()='Polo']")WebElement otherBrandLinkPolo;
	@FindBy (xpath = "//h2[text()='Brand - Polo Products']")WebElement brandPoloPage;
	
	//Launch browser
			public void url() throws InterruptedException
			{
				driver.get("http://automationexercise.com");
				Thread.sleep(3000);
			}
			
		
			
	//click on Product button
				public void clickOnproductBtn() throws Exception
				{
					productBtn.click();
					JavascriptExecutor js =(JavascriptExecutor)driver;
					js.executeScript("window.scroll(0,350)");
					Thread.sleep(3000);
					
				}	


	//Verify that Brands are visible on left side bar

			public void verifyBrandsVisible()
			{
				
				WebElement verifyBrandsVisible = brandsText;
				
				if(verifyBrandsVisible.isDisplayed())
				{
					System.out.println("Brands are Visible");
				}
					
				else 
				
					{
					System.out.println("Brands are  not Visible");
					}
			}
			
	//Click on any brand name
			public void clickOnBrandName() throws Exception
			{
				brandnameHM.click();
			}
	//Verify that user is navigated to brand page and brand products are displayed
	
			public void verifyBrandPagedisplayed()
			{
				
				WebElement verifyBrandsVisible = brandPageText;
				
				if(verifyBrandsVisible.isDisplayed())
				{
					System.out.println("Brand page and brand products are Visible");
				}
					
				else 
				
					{
					System.out.println("Brand page and brand products are not Visible");
					}
			}
			
		//On left side bar, click on any other brand link
			public void clickOnOtherBrandLink()
			{
				otherBrandLinkPolo.click();
			}
			
		//Verify that user is navigated to that brand page and can see products
	
			public void verifyBrandPageAndSeeProduct()
			{
				
				WebElement clickOnOtherBrandLink = brandPoloPage;
				
				if(clickOnOtherBrandLink.isDisplayed())
				{
					System.out.println("Polo Brand page and brand product is Visible");
				}
					
				else 
				
					{
					System.out.println("Polo Brand page and brand product is not Visible");
					}
			}
}
