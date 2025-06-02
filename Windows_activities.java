package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_activities
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.facebook.com");
	driver.navigate().back();
	driver.navigate().forward();

}
}
