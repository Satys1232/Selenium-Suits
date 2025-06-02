package com;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablegrids {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int sum = 0;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> records = driver.findElements(By.cssSelector(".tableFixHead tr td"));
		List<Integer> numbers = new ArrayList<>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");
		for (WebElement record : records) {
			String data = record.getText();
			if (data.matches("\\d+")) {
				numbers.add(Integer.parseInt(data));
				sum += Integer.parseInt(data);
			}
		}
		int addition = sum;
		int outputResult = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(addition, outputResult);
		System.out.println("Passed✅");

	}

}
