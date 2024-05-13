package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// String option = "India";
		driver.findElement(By.className("ui-autocomplete-input")).click();
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Ind");

		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.className("ui-menu-item-wrapper"));
		for (int i = 0; i < options.size(); i++) {
			if ((options.get(i).getText()).equalsIgnoreCase("India")) {
				System.out.println(options.get(i).getText());
				driver.findElements(By.className("ui-menu-item-wrapper")).get(i).click();
				System.out.println("element found :" + "India");
				break;
			}
		}
	}
}
