package com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com/angularpractice/");
	  WebElement element =  driver.findElement(By.name("name"));
	  element.sendKeys("Ganga");
	 File srcfile =  element.getScreenshotAs(OutputType.FILE);
	 
	 FileUtils.copyFile(srcfile, new File("C:\\Users\\Vijay\\Documents\\Slenium Learnings - ganga\\elementscreenshot.png"));
	 //get hieght and width of webpage
	 
	 System.out.println(element.getRect().getDimension().getHeight());
	 System.out.println(element.getRect().getDimension().getWidth());
	   

	}

}
