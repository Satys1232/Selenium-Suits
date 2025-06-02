package com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   String url =driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
	   HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
	  // conn.setRequestMethod("HEAD");
	   int responseCode = conn.getResponseCode();
	   System.out.println(responseCode);
	}

}
