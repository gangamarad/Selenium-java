package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("label[for='bmw']")).click();
		String var = driver.findElement(By.cssSelector("label[for='bmw']")).getText();

		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("dropdown-class-example"));

		Select select = new Select(element);
		select.selectByVisibleText(var);
		driver.findElement(By.name("enter-name")).sendKeys(var);
		driver.findElement(By.id("alertbtn")).click();

		String actualText = driver.switchTo().alert().getText();

		if (actualText.contains(var)) {
			System.out.println("expected text present in popup : " + var);
		}
	}
}
