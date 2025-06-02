package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_add_to_cart
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int i = 0 , count = 0;
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones");
		String itemsList[] = {"boAt Rockerz 550 Black" , "boAt Rockerz 425 Black" , "Boat Rockerz 450 Aqua Blue"};
		List<WebElement> itemNames = driver.findElements(By.cssSelector("a.a-link-normal.s-line-clamp-2.s-link-style.a-text-normal span"));
		for( i = 0; i < itemNames.size() ; i++)
		{
			String names = itemNames.get(i).getTagName();
			names.split("");
		}
		
	}

}
