package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Enabled {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		//System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).isEnabled());
		//WebElement returnDateDiv = driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"));
		 //System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getDomAttribute("style"));
		 driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).click();
		 //System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getDomAttribute("style"));
		//String bgColor = returnDateDiv.getCssValue("background-color");
		//System.out.println(bgColor);
		 if(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getDomAttribute("style").contains("rgb(238, 238, 238)"))
				 {
			 System.out.println("Disabled");
			 Assert.assertTrue(true);
				 }
		 else {
			 System.out.println("Enabled");
			 Assert.assertFalse(false);
		 }
		 
//		if(bgColor.equals("rgba(255, 255, 255, 1)"))
//		{
//			System.out.println("Enabled");
//		}
//		else {
//			System.out.println("Disabled");
//		}
		//System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).isEnabled());
	}

}
