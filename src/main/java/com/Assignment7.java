package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		WebElement tableDriver = driver.findElement(By.xpath("//table[@name='courses']"));
		List<WebElement> rows = tableDriver.findElements(By.tagName("tr"));
		List<WebElement> columns = tableDriver.findElements(By.tagName("th"));
		System.out.println("Number of rows : " + rows.size());
		System.out.println("number of columns :" + columns.size());

		WebElement row = rows.get(2);
		List<WebElement> secondRows = row.findElements(By.tagName("td"));
		for (int i = 0; i < secondRows.size(); i++) {
			System.out.println(secondRows.get(i).getText());
		}

	}
}
