package com;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumWindows {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parentId = itr.next();
		String childId = itr.next();
		driver.switchTo().window(childId);
		Thread.sleep(3000);
		String email = driver.findElement(By.cssSelector(".im-para.red")).
				getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		System.out.println(email);
		driver.findElement(By.id("username")).sendKeys(email);
	}
}
