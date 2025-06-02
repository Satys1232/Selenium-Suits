package com;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_Handle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "satya";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); 
		alert.accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("enter-name")).clear();
		driver.findElement(By.name("enter-name")).sendKeys("Jayashree");
		driver.findElement(By.id("confirmbtn")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText()); 
		alert.dismiss();
		
	}

}
