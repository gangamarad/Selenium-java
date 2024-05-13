package com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksAndSoftAssert {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert a = new SoftAssert();
		WebElement footerDriver = driver.findElement(By.cssSelector(".footer_top_agile_w3ls"));
		
		List<WebElement> elements = footerDriver.findElements(By.tagName("a"));
		
		for(int i=0;i<elements.size();i++)
		{
			String url = elements.get(i).getAttribute("href");
			HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responseCode = con.getResponseCode();
			a.assertTrue(responseCode<400,"broken link : "+elements.get(i).getText());
			
		}
		a.assertAll();
		
   }
}
