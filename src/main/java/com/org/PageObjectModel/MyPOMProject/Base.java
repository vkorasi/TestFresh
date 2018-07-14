package com.org.PageObjectModel.MyPOMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.org.PageObjectModel.ConfigFile.ExcelDataConfig;
import com.org.PageObjectModel.ConfigFile.PropertiesConfig;

public class Base {
	
	WebDriver driver = null;
	
	//public WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
	PropertiesConfig LoginPagedata=new PropertiesConfig();
	ExcelDataConfig readDataFromExcel = new ExcelDataConfig(null);
	
	
	public WebDriver getDriver() 
	{
		return driver;
	}


	public void setDriver(WebDriver driver) 
	{
		this.driver = driver;
	}

/*
	@Parameters("browser")
	public void openBrowserProperties(String browser)
	{	
		try
		{
			if(browser.equalsIgnoreCase("ff"))
			{
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("gc"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver","C:\\Users\\admin\\Downloads\\IEDriverServer\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Browser is not correct");
			e.printStackTrace();
		}
	
	}*/
	
	public Base()
	{	/*
		if(driver==null)
		{
			//openBrowserProperties("gc");
			LoginPagedata.openBrowserProperties("gc");
			driver.get(LoginPagedata.getUrl());
			LoginPagedata.maximizeBrowser(driver);
			LoginPagedata.ImplicitWait(driver);
		}
		*/
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(LoginPagedata.getUrl());
			//LoginPagedata.maximizeBrowser(driver);
			//myWaitVar = new WebDriverWait(driver, 30);
			LoginPagedata.ImplicitWait(driver);
		}
		
		
	}
	
	public void closeBrowser()
	{
		driver.close();

	}

}
