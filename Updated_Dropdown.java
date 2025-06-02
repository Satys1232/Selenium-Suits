package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_Dropdown
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for (int i = 1; i < 5; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();// 2 adult
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	driver.findElement(By.cssSelector("div[data-testid=\"home-page-travellers\"]")).click();
}
}
