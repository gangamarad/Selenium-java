package com;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> Price;
		do {
			List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
			Price = list.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceDetails(s))
					.collect(Collectors.toList());
			Price.stream().forEach(s -> System.out.println(s));
			if (Price.size() < 1) {
				//do next untill we find rice Item
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while (Price.size() < 1);
	}

	static String getPriceDetails(WebElement s) {

		return s.findElement(By.xpath("following-sibling::td[1]")).getText();

	}
}
