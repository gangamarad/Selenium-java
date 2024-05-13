package com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsAssignment {
	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String ParentId = itr.next();
		String ChildId = itr.next();
		driver.switchTo().window(ChildId);
		Thread.sleep(2000);
		System.out.println("Child Window : "+ driver.findElement(By.cssSelector("div.example")).getText());
		driver.switchTo().window(ParentId);
		System.out.println("Parent Window :"+driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
	}
}
