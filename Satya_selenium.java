package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Satya_selenium {
	public static void main(String[] args) {
		// set the path to your CHROMEDRIER executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\satya\\Desktop\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\satya\\Desktop\\edgedriver_win64\\msedgedriver.exe");
		// Create a new instance of the CHROME driver
		WebDriver driver = new ChromeDriver();
		WebDriver driver2 = new FirefoxDriver();
		WebDriver driver3 = new EdgeDriver();
		// Open a WEBSITE (for example, Google)
		driver.get("https://www.google.com");
		driver2.get("https://www.google.com");
		driver3.get("https://www.google.com");
		// Print the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		System.out.println("Page title is : " + driver2.getTitle());
		System.out.println("Page title is : " + driver3.getTitle());
		// To print URL
		System.out.println("Chrome - Page URL is :" + driver.getCurrentUrl());
		System.out.println("Firefox - Page URL is :" + driver2.getCurrentUrl());
		System.out.println("Edge - Page URL is :" + driver3.getCurrentUrl());
		// Close the browser
		driver.quit();
		driver2.quit();
		driver3.quit();
		
		
	}
}
