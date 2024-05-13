package com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WeddriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// count the number of links on page
		System.out.println("window links" + driver.findElements(By.tagName("a")).size());

		// limiting webdriver scope to footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("footer link" + footerDriver.findElements(By.tagName("a")).size());

		// finding the links count in first column
		WebElement colmDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("colmn likns" + colmDriver.findElements(By.tagName("a")).size());

		// opening the links and get the title
		for (int i = 1; i < colmDriver.findElements(By.tagName("a")).size(); i++) {
			colmDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			Thread.sleep(3000);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {

			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}

	}
}
