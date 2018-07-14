package com.org.PageObjectModel.MyPOMProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.org.PageObjectModel.ConfigFile.PropertiesConfig;

public class SPSDC4PreProdHomePage {
	
	PropertiesConfig LoginPagedata=new PropertiesConfig();
	
	public SPSDC4PreProdHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'DC4')][@id='form1:menuTabs1:0:commandMenuItem1']") 
	public WebElement DC4Tab;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "html/body/form/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[4]/a") 
	public WebElement DC4AdminTab;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "html/body/form/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[18]/a") 
	public WebElement errorHospital;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "html/body/form/span[1]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/a") 
	public WebElement logoutButton;
	

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='inputText41']") 
	public WebElement companyNameTxtBox;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "html/body/form/span[1]/div[1]/div[3]/span/table[1]/tbody/tr/td[2]/a") 
	public WebElement customerByNameTab;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='commandButton12']") 
	public WebElement searchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = ".//*[@id='table1']/table/tbody/tr[2]/td/table/tbody/tr/td[1]") 
	public List<WebElement> listOfCompanies;
	
	
	/*@CacheLookup
	@FindBy(how = How.XPATH, using = "html/body/form/span[1]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/a") 
	public WebElement logoutBtn;
*/
	
	public void clickOnDC4Tab()
	{
		DC4Tab.click();
	}
	
	public void clickOnAddNewCustomerButton()
	{
		//need locators above and body in this method
	}
	
	public void typeNewCustomerNameInTextBox()
	{
		//need locators above and body in this method
	}
	
	public void clickOnSaveButton()
	{
		//need locators above and body in this method
	}
	
	public void clickOnCancelButton()
	{
		//need locators above and body in this method
	}
	
	public void typeCompanyNameInTextBox()
	{
		companyNameTxtBox.click();
		companyNameTxtBox.sendKeys(LoginPagedata.getCompanyName());
	
	}
	
	public void clickOnSearchButton()
	{
		searchBtn.click();
		
	}
	
	public void selectRequiredCompanyFromListOfCompanies()
	{
		
		
	}
	
	public void clickOnProfileLink()
	{
		
		
	}
	
	public void getAllTheExistingProfilesList()
	{
		
		
	}
	
	public void ClickOnCreateNewProfile()
	{
		
		
	}
	
	
	
	
	
}
