package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Crew {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.manage().window().maximize();
		WebElement Form = driver.findElement(By.cssSelector("div[data-testid = 'to-testID-origin']:first-child>div"));// to find the form
		Form.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement writableAreaOrigin = driver.findElement(By.cssSelector(
				"div[data-testid = 'to-testID-origin'] input.css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")); 
		// IT IS TO FIND THE WRITABLE AREA FOR ORIGIN.
		writableAreaOrigin.sendKeys("de");
		// SENDING de TO THE BLANK SPACE INPUT
		List<WebElement> cityElementsOrigin = driver
				.findElements(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-ov7bg.r-z2wwpe.r-utggzx.r-atwnbb.r-cfp7ip>div"));
	    // TO GET ALL THE CITIES START WITH DE.	
		// List<WebElement> cityElements =
		// driver.findElements(By.cssSelector(".css-1dbjc4n.r-18u37iz
		// div.css-76zvg2.r-cqee49.r-ubezar.r-1kfrs79"));
		// List<WebElement> cityElements =
		// driver.findElements(By.cssSelector("div.css-1dbjc4n.r-18u37iz
		// .css-76zvg2.r-1srvcxg"));
		for (WebElement city : cityElementsOrigin) {
			if (city.getText().contains("DEL")) {
				city.click();
				break;
			}
		}
		// ITERATING THROUGH ALL THE ELEMENTS AND WHEN DEL MATCH IT CLICK AND EXIT.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement writableAreaDestination = driver.findElement(By.cssSelector(
				"div[data-testid = 'to-testID-destination'] input.css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu"));
		// IT IS TO FIND THE WRITABLE AREA FOR DESTINATION 
		writableAreaDestination.sendKeys("ch");
		// SENDING KEY CH TO THE BLANK SPACE INPUT.
		List<WebElement> cityElementsDestination = driver
				.findElements(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-ov7bg.r-z2wwpe.r-utggzx.r-atwnbb.r-cfp7ip>div"));
		// TO GET ALL THE CITIES START WITH CH 
		for (WebElement city : cityElementsDestination) {
			if (city.getText().contains("MAA")) {
				city.click();
				break;
			}
		}
		// ITERATING THROUGH ALL THE ELEMENTS AND WHEN MAA MATCH IT CLICK AND EXIT.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// WAITING 2 SEC.
		driver.findElement(By.cssSelector("div[data-testid = 'undefined-month-May-2025'] div[data-testid= 'undefined-calendar-day-21']")).click();
		// TO SELECT DATE.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getDomAttribute("style").contains("rgb(238, 238, 238)"))
		 {
	 System.out.println("Disabled");
	 Assert.assertTrue(true);
		 }
			else {
				System.out.println("Enabled");
				Assert.assertFalse(false);
			}
		 // FIND IF THE RETURN DATE AREA IS ENABLED OR DISABLED
		 driver.findElement(By.cssSelector("div[data-testid=\"home-page-travellers\"]")).click(); 
		 // TO FIND THE CLICKABLE AREA ON CLICKING WHICH OPENS THE TAB FOR SELECTING NO. OF ADULTS.
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 WebElement add = driver.findElement(By.cssSelector("div[data-testid=\'Adult-testID-plus-one-cta\']"));
		 for(int i = 1 ; i < 5; i++)
		 {
			 add.click();
		 }
		 // TO CLICK UPTO 5 ADULTS.
		 driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click();
		 // TO SELECT TEH DONE BUTTON AFTER SELECTING ADULTS.
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.findElement(By.xpath("//div[@data-focusable = 'true' and .//div[text()='Currency']]")).click();
			// FOR SELECTING ON THE CURRENCY TO SELECT..
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.findElement(By.xpath("//div[@data-focusable = 'true']/div[contains(text(),'INR')]"));
		// FOR SELECTING INR
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		
		// FOR CLICKING ON FAMILY AND FRIENDS TEXT TO SELECT IT
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
		// FOR CLICKING ON SEARCH FLIGHT TO SEARCH FLIGHT
	}
}
