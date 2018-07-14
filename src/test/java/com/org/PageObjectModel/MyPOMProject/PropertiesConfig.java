package com.org.PageObjectModel.MyPOMProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

public class PropertiesConfig {
	
	WebDriver driver;
	Properties prop;
	
	public PropertiesConfig()
	{
		File file = new File("./target/bconelogincred.properties");
		try {
			FileInputStream fin = new FileInputStream(file);
			prop = new Properties();
			try 
			{
				prop.load(fin);
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

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
				System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase(prop.getProperty("ie")))
			{
				System.setProperty("webdriver.ie.driver",prop.getProperty("IEPath"));
				driver=new InternetExplorerDriver();
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Browser is not correct");
			e.printStackTrace();
		}
	
	}
	
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	
	}
	
	public void ImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	public String getUrl()
	{
		return prop.getProperty("DC4PreProd.URL");
		
	}
	
	public String getUserName()
	{
		return prop.getProperty("DC4PreProd.USERNAME");
	}
	
	public String getPassword()
	{
		return prop.getProperty("DC4PreProd.PASSWORD");
	}
	
	public String getCompanyName()
	{
		return prop.getProperty("DC4PreProd.COMPANYNAME");
	}
	
}
	
