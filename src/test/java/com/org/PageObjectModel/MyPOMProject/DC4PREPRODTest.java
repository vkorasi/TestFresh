package com.org.PageObjectModel.MyPOMProject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DC4PREPRODTest extends Base {

	SPSDC4PreProdLoginPage loginPage = new SPSDC4PreProdLoginPage(driver);
	SPSDC4PreProdHomePage homePage = new SPSDC4PreProdHomePage(driver);
	
	@BeforeMethod
	public void openBrowser()
	{
		super.getDriver();
	}
	
	@Test(priority=1)
	public void testLogin()
	{
		loginPage.testLogin();
	}
	
	@Test(priority=2)
	public void clickOnDC4Tab()
	{
		homePage.clickOnDC4Tab();
	}
	
	@Test(priority=3)
	public void typeCompanyNameInTextBox()
	{
		homePage.typeCompanyNameInTextBox();
	}
	
	@Test(priority=4)
	public void clickOnSearchButton()
	{
		homePage.clickOnSearchButton();
	}
}
