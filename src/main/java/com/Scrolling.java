package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		int sum = 0;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000\r\n" + "");
		List<WebElement> elements = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for (int i = 0; i < elements.size(); i++) {
			sum = sum + Integer.parseInt(elements.get(i).getText());

		}
		System.out.println("sum is :" + sum);
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(total, sum);
		int totalColumns = 0;
		List<WebElement> tablecolms = driver.findElements(By.cssSelector("table[name='courses'] td:nth-child(3)"));
		for(int i=0;i<tablecolms.size();i++)
		{
			totalColumns = totalColumns + Integer.parseInt(tablecolms.get(i).getText());
		}
		System.out.println("totalcolumns sum : "+ totalColumns);
	}

}
