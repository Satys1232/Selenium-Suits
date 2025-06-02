package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingnment7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		System.out.println("Row size: "
				+ driver.findElements(By.cssSelector(".block.large-row-spacer .left-align table tbody tr")).size()
				+ " || " + "Column size: "
				+ driver.findElements(By.cssSelector(".block.large-row-spacer .left-align table tbody th")).size());
		System.out.println(driver.findElement(By.xpath(
				"//div[contains(@class,'block') and contains(@class , 'large-row-spacer')]/div[@class='left-align'] /fieldset /table/tbody/tr[2]"))
				.getText());

	}

}
