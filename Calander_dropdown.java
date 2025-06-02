package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander_dropdown
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.cssSelector("div[data-testid = 'departure-date-dropdown-label-test-id']")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("div[data-testid = 'undefined-month-May-2025'] div[data-testid= 'undefined-calendar-day-20']")).click();
	
}
}
