package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("satya2351332");
		// driver.findElement(By.cssSelector("form h2")).sendKeys("satya2351332");
		// Can't use this because it's an Heading.
		driver.findElement(By.name("inputPassword")).sendKeys("Satya@123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sats");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("satya");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hellobuddy12344321@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7381170681");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("satya");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
