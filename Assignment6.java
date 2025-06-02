package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement option = driver.findElement(By.id("checkBoxOption1"));
		option.click();
		String optionText = driver.findElement(By.xpath("(//div[@id='checkbox-example']//label)[1]")).getText().trim();
		WebElement staticDropDown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(staticDropDown);
		staticDropDown.click();
		dropDown.selectByContainsVisibleText(optionText);
		driver.findElement(By.id("name")).sendKeys(optionText);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText().trim();
		if (alertText.contains(optionText)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		alert.accept();

	}

}
