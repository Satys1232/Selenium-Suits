package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleassignmenttablegrid {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> records = driver
				.findElements(By.cssSelector(".block.large-row-spacer .left-align table tr td:nth-child(3)"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		for (WebElement record : records) {
			String data = record.getText();
			if (data.matches("\\d+")) {
				System.out.println(Integer.parseInt(data));
			}
		}
	}

}
