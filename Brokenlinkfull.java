package com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.testng.asserts.SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinkfull {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector(".gf-li a"));
		SoftAssert sa = new SoftAssert();
		for (WebElement link : links) {
			String url = link.getDomProperty("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			int responseCode = conn.getResponseCode();
			sa.assertTrue(responseCode<400,"Fail");
			
		}
            sa.assertAll();
	}
}
