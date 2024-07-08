package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC18_ViewCategoryProduct {
	
	

WebDriver driver;
	
	public TC18_ViewCategoryProduct(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//repo
	@FindBy (xpath = "//h2[text()='Category']")WebElement categoryText;
	@FindBy (xpath = "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")WebElement womenCategory;
	@FindBy (xpath = "//*[@id=\"Women\"]/div/ul/li[1]/a")WebElement dressUnderWomen;
	@FindBy (xpath = "/html/body/section/div/div[2]/div[2]/div/h2")WebElement womenDressText;
	@FindBy (xpath = "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")WebElement menLink;
	@FindBy (xpath = "//*[@id=\"Men\"]/div/ul/li[1]/a")WebElement tshirtLink;
	@FindBy (xpath = "/html/body/section/div/div[2]/div[2]/div/h2")WebElement menCategoryList;
	
	//Launch browser
			public void url() throws InterruptedException
			{
				driver.get("http://automationexercise.com");
				Thread.sleep(3000);
			}


		//Verify that categories are visible on left side bar

			public void verifyCategoryText()
			{
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("window.scroll(0,250)");	
				
				WebElement verifyCategoryText = categoryText;
				
				if(verifyCategoryText.isDisplayed())
				{
					System.out.println("Category is displayed");
				}
					
				else 
				
					{
					System.out.println("Category is not displayed");
					}
			}
			
		//Click on 'Women' category
			public void clickOnWomen() throws Exception
			{
				womenCategory.click();
				Thread.sleep(2000);
			}
			
		//Click on any category link under 'Women' category, for example: Dress
			public void clickOnDressUnderWomen() 
			{
				dressUnderWomen.click();
				
			}
	
		//Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
			public void verifyCategoryPageDisplayedAndConfirmText()
			{
				 WebElement categoryPage = womenDressText;
		    	 
		    	 if(categoryPage.isDisplayed())
		    	 {
		    		 System.out.println("'WOMEN - DRESS PRODUCTS': is displayed");
		    		}
		    	 else
		    	 {
		    		 System.out.println("'WOMEN - DRESS PRODUCTS': is not displayed");
		    	 }
			}
			
		//On left side bar, click on any sub-category link of 'Men' category
			public void clickOnMenSubCategory() throws Exception 
			{
				menLink.click();
				Thread.sleep(2000);
				tshirtLink.click();
			}
			
		//Verify that user is navigated to that category page
	
			public void verifyNavigateToCategoryPage()
			{
				 WebElement mencategoryPage = menCategoryList;
		    	 
		    	 if(mencategoryPage.isDisplayed())
		    	 {
		    		 System.out.println("'WOMEN - DRESS PRODUCTS': is displayed");
		    		}
		    	 else
		    	 {
		    		 System.out.println("'WOMEN - DRESS PRODUCTS': is not displayed");
		    	 }
			}
}


