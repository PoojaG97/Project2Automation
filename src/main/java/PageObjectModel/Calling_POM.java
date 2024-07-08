package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling_POM {
	
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*TC02_LoginUser_CorrectEmailPassword lg= new TC02_LoginUser_CorrectEmailPassword(driver);
		
		lg.url();
		lg.verifyHomePage();
		lg.clickOnSignInBtn();
		lg.verifyLoginToAcc();
		lg.enterEmail("pooja12girpunje@gmail.com");
		lg.enterPassword("Pooja@123");
		lg.clickOnLoginBtn();
		lg.verifyLoggedAsUsername();
		lg.clickOnDltBtn();
		lg.verifyAccDeleted();
		driver.close();*/
		
		
		/*TC03_LoginUser_Incorrect_emilPassword lg2= new TC03_LoginUser_Incorrect_emilPassword(driver);
		
		lg2.url();
		lg2.verifyHomePage();
		lg2.clickOnSignInBtn();
		lg2.verifyLoginToAcc();
		lg2.enterEmail("poojagirpunje@gmail.com");
		lg2.enterPassword("Pooja");
		lg2.clickOnLoginBtn();
		lg2.verifyErrorMsg();
		driver.close();*/
		
		/*TC04_Logout_User lg1= new TC04_Logout_User(driver);
		lg1.url();
		lg1.verifyHomePage();
		lg1.clickOnSignInBtn();
		lg1.verifyLoginToAcc();
		lg1.enterEmail("pooja12@gmail.com");
		lg1.enterPassword("123456");
		lg1.clickOnLoginBtn();
		lg1.verifyLoggedAsUsername();
		lg1.clickOnLogout();
		lg1.verifyUserNavigateToLoginPage();
		driver.close();*/
		
		/*TC05_Register_User_WithExistingEmail lg3 = new TC05_Register_User_WithExistingEmail(driver);
		lg3.url();
		lg3.verifyHomePage();
		lg3.clickOnSignInBtn();
		lg3.verifyNewUserSignupText();
		lg3.enterName("Pooja");
		lg3.enterEmail("pooja12girpunje@gmail.com");
		lg3.clickOnSignUpBtn();
		lg3.verifyEmailAlreadyExistText();
		driver.close();*/
		
		/*TC06_ContactUsForm form = new TC06_ContactUsForm(driver);
		form.url();
		form.verifyHomePage();
		form.clickOnContactUs();
		form.verifyGetInTouchVisible();
		form.enterNameEmailSubjectMsg();
		form.uploadFile();
		form.clickOnSubmit();
		form.clickOnOK();
		form.verifySuccessMsgVisible();
		form.clickOnHome();
		driver.close();*/
		
		/*TC07_Verify_TestCasePage lg4 = new TC07_Verify_TestCasePage(driver);
		lg4.url();
		lg4.verifyHomePage();
		lg4.clickOnTestCaseBtn();
		lg4.verifyTestCasePageVisible();
		driver.close();*/
		
		
		/*TC08_All_ProductsAndProduct_DetailsPage lg5 =  new TC08_All_ProductsAndProduct_DetailsPage(driver);
		lg5.url();
		lg5.verifyHomePage();
		lg5.clickOnproductBtn();
		lg5.verifyAllproductPageVisible();
		lg5.clickOnViewproductBtn();
		lg5.verifyProductDetailsVisible();
		driver.close();*/
		
		
		/*TC09_SearchProduct lg6 = new TC09_SearchProduct(driver);
		lg6.url();
		lg6.verifyHomePage();
		lg6.clickOnproductBtn();
		lg6.verifyAllproductPageVisible();
		lg6.enterProductAndClickSearchBtn("top");
		lg6.verifySearchproductVisible();
		lg6.verifyAllProductArevisible();
		driver.close();*/
		
		
		/*TC10_Verify_Subscription_InHomePage lg7 = new TC10_Verify_Subscription_InHomePage(driver);
		lg7.url();
		lg7.verifyHomePage();
		lg7.scrollDown();
		lg7.verifytextSubscription();
		lg7.enterEmailAndClickArrow("Pooja12@gmail.com");
		lg7.verifySuccessMsg();
		driver.close();*/
		
		
		/*TC11_Verify_Subscription_InCartPage lg8 = new TC11_Verify_Subscription_InCartPage(driver);
		lg8.url();
		lg8.verifyHomePage();
		lg8.clickOnCartBtn();
		lg8.scrollDown();
		lg8.verifytextSubscription();
		lg8.enterEmailAndClickArrow("pooja12@gmail.com");
		lg8.verifySuccessMsg();
		driver.close();*/
		
		
		/*TC12_Add_Product_InCart lg9 = new TC12_Add_Product_InCart(driver);
		lg9.url();
		lg9.verifyHomePage();
		lg9.clickOnproductBtn();
		lg9.firstProductAddToCart();
		lg9.clickOnContinueShoppingBtn();
		lg9.secondProductAddToCart();
		lg9.clickOnViewCartBtn();
		lg9.verifyProductsAddedToCart();
		lg9.verifypriceQuantityandatotalprice();
		driver.close();*/
		
		
		/*TC13_Verify_ProductQuantityInCart lg10 = new TC13_Verify_ProductQuantityInCart(driver);
		lg10.url();
		lg10.verifyHomePage();
		lg10.clickOnViewProduct();
		lg10.verifyProductDetailisOpen();
		lg10.increaseQuantity();
		lg10.clickOnAddToCartBtn();
		lg10.clickOnViewCartBtn();
		lg10.verifyProductisDisplayedinCardWithExactQuantity();
		driver.close();
		*/
		
		/*TC14_PlaceOrder_RegisterWhileCheckout lg11 = new TC14_PlaceOrder_RegisterWhileCheckout(driver);
		lg11.url();
		lg11.verifyHomePage();
		lg11.AddProductToCart();
		lg11.clickOnCartBtn();
		lg11.verifyCartPageDisplayed();
		lg11.clickProceedToCheckout();
		lg11.clickRegisterLoginBtn();
		lg11.fillDetailsInSignUp();
		lg11.verifyAccCreatedAndClickCountinueBtn();
		lg11.verifyLoggedInasUsernameVisible();
		lg11.clickOnCartBtn1();
		lg11.clickProceedToCheckout1();
		lg11.verifyAddDetailsReviewOrder();
		lg11.enterDescriptionAndclickplaceOrder();
		lg11.enterpaymentdetails("pooja","311","122","12","2025");
		lg11.clickOnPayAndConfirmOrderBtn();
		lg11.verifySuccessMsg();
		lg11.dltAcc();
		lg11.AccDltAndClickContinueeBtn();
		driver.close();*/
		
		TC15_PlaceOrder_RegisterBeforeCheckout pl2 = new TC15_PlaceOrder_RegisterBeforeCheckout(driver);
		pl2.url();
		pl2.verifyHomePage();
		pl2.clickOnSignInBtn();
		pl2.fillDetailsInSignUp();
		pl2.verifyAccCreatedAndClickCountinueBtn();
		pl2.verifyLoggedInasUsernameVisible();
		pl2.AddProductToCart();
		pl2.clickOnCartBtn();
		pl2.verifyCartPageDisplayed();
		pl2.clickProceedToCheckout();
		pl2.verifyAddDetailsReviewOrder();
		pl2.enterDescriptionAndclickplaceOrder();
		pl2.enterpaymentdetails("pooja","123","123","12","2025");
		pl2.clickOnPayAndConfirmOrderBtn();
		pl2.verifySuccessMsg();
		pl2.dltAcc();
		pl2.AccDltAndClickContinueeBtn();
		driver.close();
		
		/*TC16_PlaceOrder_LoginBeforeCheckOut pl = new TC16_PlaceOrder_LoginBeforeCheckOut(driver);
		pl.url();
		pl.verifyHomePage();
		pl.clickOnSignInBtn();
		pl.fillDetails("pooja12@gmail.com","123456");
		pl.verifyLoggedAsUsername();
		pl.addProductToCart();
		pl.clickOnCartBtn();
		pl.verifyCartPageDisplayed();
		pl.clickProceedToCheckout1();
		pl.verifyAddDetailsReviewOrder();
		pl.enterDescriptionAndclickplaceOrder();
		pl.enterpaymentdetails("pooja","123","123","12","2025");
		pl.clickOnPayAndConfirmOrderBtn();
		pl.verifySuccessMsg();
		pl.clickdltAcc();
		pl.AccDltAndClickContinueeBtn();
		driver.close();*/
		
		/*TC17_Remove_ProductFromCart lg12 = new TC17_Remove_ProductFromCart(driver);
		lg12.url();
		lg12.verifyHomePage();
		lg12.AddProductToCart();
		lg12.clickOnCartBtn();
		lg12.verifyCartPageDisplayed();
		lg12.clickOnXBtn();
		lg12.verifyProductIsremovedFromCart();
		driver.close();*/
		
		/*TC18_ViewCategoryProduct lg13 = new TC18_ViewCategoryProduct(driver);
		lg13.url();
		lg13.verifyCategoryText();
		lg13.clickOnWomen();
		lg13.clickOnDressUnderWomen();
		lg13.verifyCategoryPageDisplayedAndConfirmText();
		lg13.clickOnMenSubCategory();
		lg13.verifyNavigateToCategoryPage();
		driver.close();*/
		
		/*TC19_ViewCartBrandProduct lg14 = new TC19_ViewCartBrandProduct(driver);
		lg14.url();
		lg14.clickOnproductBtn();
		lg14.verifyBrandsVisible();
		lg14.clickOnBrandName();
		lg14.verifyBrandPagedisplayed();
		lg14.clickOnOtherBrandLink();
		lg14.verifyBrandPageAndSeeProduct();
		driver.close();*/
		
		/*TC20_SearchProductAndVerifyCartAfterLogin lg15 = new TC20_SearchProductAndVerifyCartAfterLogin(driver);
		lg15.url();
		lg15.clickOnproductBtn();
		lg15.verifyAllproductPageVisible();
		lg15.enterProductAndClickSearchBtn("top");
		lg15.verifySearchproductVisible();
		lg15.verifyAllProductArevisible();
		lg15.addProductToCart();
		lg15.clickcartBtnverifyProductvisibleInCart();
		lg15.clickOnSignUpLoginBtnSubmitLoginDetails("pooja12@gmail.com","123456");
		lg15.gotoCart();
		lg15.verifyProductvisibleinCartAfterLogin();
		driver.close();*/
		
		/*TC21_AddReviewOnProduct lg16 = new TC21_AddReviewOnProduct(driver);
		lg16.url();
		lg16.clickOnproductBtn();	
		lg16.verifyAllproductPageVisible();
		lg16.clickOnViewProductBtn();
		lg16.verifyWriteYourReviewVisible();
		lg16.enterNameEmailReview("pooja", "pooja12@gmail.com", "good product");
		lg16.clickOnSubmitBtn();
		lg16.verifySuccessMsg();
		driver.close();*/
		
		/*TC22_AddToCartFromRecommendedItems lg17 = new TC22_AddToCartFromRecommendedItems(driver);
		lg17.url();
		lg17.scrollToBottomOfPage();
		lg17.verifyRecommendedItemsVisible();
		lg17.clickOnaddToCart();
		lg17.clickOnviewCartBtn();
		lg17.verifyProductisDisplayedinCartPage();
		driver.close();*/
		
		/*TC25_verifyScrollUp_UsingArrowButtonAndScollSownFunctionality lg18 = new TC25_verifyScrollUp_UsingArrowButtonAndScollSownFunctionality(driver);
		lg18.url();
		lg18.verifyHomePage();
		lg18.scrollDownPageToBottom();
		lg18.verifytextSubscription();
		lg18.clickOnArrowBtn();
		lg18.verifyPageScrollUp();
		driver.close();*/
		
		/*TC26_VerifyScrollUpWithoutArrowBtnAndScrollDownFunc lg19 = new TC26_VerifyScrollUpWithoutArrowBtnAndScrollDownFunc(driver);
		lg19.url();
		lg19.verifyHomePage();
		lg19.scrollDownPageToBottom();
		lg19.verifytextSubscription();
		lg19.scrollUpPageToTop();
		lg19.verifyPageScrollUp();
		driver.close();*/
	
}
}