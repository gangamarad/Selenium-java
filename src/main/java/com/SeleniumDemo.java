package com;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo implements WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step to set up chrome driver
		//chromeDriver.exe file is responsible for chrome browser invoke, downloaqd th compatible version with your system and give its path 
		//System.setProperty("webDriver.chrome.driver","path of chromeDriver.exe file from local path to reduce the time for execution");
		
		//by Default selenium manager is going to take care of invoking browser internally. this approach is commenly used.
		WebDriver driver = new ChromeDriver();
		
		
		//Launch FirefoxDriver
		// to add the path of geckoDriver which is responsible for launching the firefox
		//System.setProperty(WebDriver.gecko.driver, "path of GeckoDriver which is downloaded in local")
		WebDriver driver1 = new FirefoxDriver();
		
		
		//Launching MicrosoftEdge browser
		//EdgeDriver.exe file is responsible for executing the edgeBrowser, so need to set its path
		//System.setProperty(WebDriver.edge.driver, "path of GeckoDriver which is downloaded in local");
		
		WebDriver driver2 = new EdgeDriver();
		
		
		
		//hitting particular url
		driver.get("https://mvnrepository.com/tags/selenium");
		System.out.print(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// driver.quit();
	}

	
	
	
	
	
	
	
	
	
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
