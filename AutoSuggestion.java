package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\satya\\Desktop\\geckodriver-v0.36.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	//driver.findElement(By.id("src")).sendKeys("Bhu");
	driver.findElement(By.className("label___7cec60"));
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	List<WebElement> options = driver.findElements(By.xpath("//div/text[@class='placeHolderMainText']"));
	for(WebElement option:options)
	{
		if(option.getText().equalsIgnoreCase("Bhubaneswar"))
			{
			option.click();
			}
	}
	
}
}
