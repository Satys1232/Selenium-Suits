package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeoptions2 {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().deleteCookie("Session Key");
	driver.manage().addCookie(null);
}
}
