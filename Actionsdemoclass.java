package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemoclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Actions action = new Actions(driver);
	WebElement target = driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
	action.moveToElement(target).click().keyDown(Keys.SHIFT).sendKeys("satya").doubleClick().build().perform();
	action.moveToElement(target).contextClick().build().perform();
	
}
}
