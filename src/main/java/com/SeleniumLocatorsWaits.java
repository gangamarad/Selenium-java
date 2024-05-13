package com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLocatorsWaits {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value=user]")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		Thread.sleep(3000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(3000);

		WebElement webelement = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(webelement);
		select.selectByVisibleText("Consultant");

		driver.findElement(By.name("signin")).click();

		wait.until(ExpectedConditions.urlContains("https://rahulshettyacademy.com/angularpractice/shop"));
		List<WebElement> webelements = driver.findElements(By.cssSelector("h4.card-title"));
		for (int i = 0; i < webelements.size(); i++) {
			driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
		}

		driver.findElement(By.cssSelector("a.btn-primary")).click();
		// FluentWait

		/*
		 * Wait w = new FluentWait(driver); WebElement element = (WebElement)
		 * w.until(new Function<WebDriver, WebElement>() {
		 * 
		 * @Override public WebElement apply(WebDriver driver) {
		 * 
		 * return driver.findElement(By.id("foo")); // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * });
		 */

	}

}
