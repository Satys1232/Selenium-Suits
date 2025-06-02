package com;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Extract_string {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		in.close();
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\satya\\Desktop\\geckodriver-v0.36.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\satya\\Desktop\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver); // PASSWORD
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.className("signInBtn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.tagName("p")).getText()); // IT RETURNS AN OBJECT ON WHICH WE PERFROM							// .GETTEXT ACTION.
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");

	}

	public static String getPassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
//		String [] passwordArray2 = passwordArray[1].split("'");
//	    String ActualPassword = passwordArray2[0];
		String password = passwordArray[1].split("'")[0];
		return password;

	}

}
