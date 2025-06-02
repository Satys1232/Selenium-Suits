package com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("SatyaBrataPatra");
		driver.findElement(By.name("email")).sendKeys("satyabratapatra299@gmail.com");
		driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("Satya@123");
		driver.findElement(By.cssSelector("input[type^='pass']")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("07/07/2004");
		driver.findElement(By.cssSelector("input[value^='Sub']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println(driver.findElement(By.cssSelector(".alert ")).getText());

	}

}
