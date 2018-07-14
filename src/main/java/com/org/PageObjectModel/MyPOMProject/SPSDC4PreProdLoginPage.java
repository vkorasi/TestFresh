package com.org.PageObjectModel.MyPOMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.org.PageObjectModel.ConfigFile.ExcelDataConfig;
import com.org.PageObjectModel.ConfigFile.PropertiesConfig;


public class SPSDC4PreProdLoginPage 
{	
	PropertiesConfig LoginPagedata=new PropertiesConfig();
	
	String excelFilePath = "./target/Book1.xls";
	
	ExcelDataConfig readDataFromExcel = new ExcelDataConfig(excelFilePath);
	
	//This constructor will initialize the objects in this page
	public SPSDC4PreProdLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='c2']") 
	public WebElement userNameTxtBox;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='c3']") 
	public WebElement passwordTxtBox;
	
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit']") 
	public WebElement loginButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "html/body/center/table/tbody/tr[3]/td/font/input[2]") 
	public WebElement cancelBtn;
	
	public void testLogin()
	{
		/*userNameTxtBox.clear();
		userNameTxtBox.sendKeys(LoginPagedata.getUserName());
		passwordTxtBox.clear();
		passwordTxtBox.sendKeys(LoginPagedata.getPassword());
		loginButton.click();*/
		
		//int i,j = 0;
		userNameTxtBox.clear();
		userNameTxtBox.sendKeys(readDataFromExcel.getData(0, 0, 0));
		passwordTxtBox.clear();
		passwordTxtBox.sendKeys(readDataFromExcel.getData(0, 0, 1));
		loginButton.click();
		
		System.out.println("Data in Excel sheet1");
		
		/*for(i=0;i<2;i++)
		{
			for( j=0;j<2;j++)
			{
				userNameTxtBox.clear();
				userNameTxtBox.sendKeys(readDataFromExcel.getData(0, i, j));
				System.out.println(readDataFromExcel.getData(0, i, j));
				passwordTxtBox.clear();
				passwordTxtBox.sendKeys(readDataFromExcel.getData(0, i, j));
				System.out.println(readDataFromExcel.getData(0, i, j));
				loginButton.click();
			}
			System.out.println();
		}		*/
	}
}
