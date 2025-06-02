package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Handlingssl {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		FirefoxOptions options1 = new FirefoxOptions();
		EdgeOptions options2 = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		options1.setAcceptInsecureCerts(true);
		options2.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\satya\\Desktop\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\satya\\Desktop\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		WebDriver driver1 = new FirefoxDriver(options1);
		WebDriver driver2 = new EdgeDriver(options2);
		driver.get("https://expired.badssl.com/");
		driver1.get("https://expired.badssl.com/");
		driver2.get("https://expired.badssl.com/");
		System.out.println("Chrome: " + driver.getTitle());
		System.out.println("Firefox: " + driver1.getTitle());
		System.out.println("Msedge: " + driver2.getTitle());

	}

}
