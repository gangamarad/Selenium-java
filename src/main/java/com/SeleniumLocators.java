package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///WebDriver driver = webdriver.Chrome(ChromeDriverManager().install());
		 WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Ganga");
	     Thread.sleep(2000);
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

	}

}
