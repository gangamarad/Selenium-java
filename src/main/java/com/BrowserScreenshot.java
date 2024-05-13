package com;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException

	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//convert driver to screenshot obj first and take the screenshot as file
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//now screenshot is there in above src obj, but we want that to be accessed in via file so copy it to local fi;e
		FileUtils.copyFile(src, new File("C:\\Users\\Vijay\\Documents\\Slenium Learnings - ganga\\screenshot.png"));
		
		//Taking screenshot for next window
		driver.findElement(By.linkText("Open Tab")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parentId = itr.next();
		String ChildId = itr.next();
		
	    driver.switchTo().window(ChildId);
		Thread.sleep(3000);
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("C:\\Users\\Vijay\\Documents\\Slenium Learnings - ganga\\screenshot2.png"));
		
		
		
	}
}
