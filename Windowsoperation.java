package com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsoperation {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/documents-request']")).click();
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> it = winid.iterator();
		String parentid = it.next();
		String childid =  it.next();
		driver.switchTo().window(childid);
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0].trim();
		driver.switchTo().window(parentid);
		driver.findElement(By.name("username")).sendKeys(email);

	}
	

}
