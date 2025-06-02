package com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calandertest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		int i = 0;
		String year = "2027";
		String month = "6";
		String day = "15";
		String[] dmy = { month, day, year };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> it = winid.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath(
				"//button[@class='react-date-picker__calendar-button react-date-picker__button']/*[local-name()='svg']"))
				.click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElement(By.xpath(
				"(//button[@class='react-calendar__tile react-calendar__year-view__months__month'])[" + month + "]"))
				.click();
		driver.findElement(By.xpath("//abbr[text()='" + day + "']")).click();
//		String outputMonth = driver
//				.findElement(By.cssSelector(".react-date-picker__inputGroup input[value='" + month + "']"))
//				.getDomProperty("value");
//		String outputDay = driver
//				.findElement(By.cssSelector(".react-date-picker__inputGroup input[value='" + day + "']"))
//				.getDomProperty("value");
//		String outputYear = driver
//				.findElement(By.cssSelector(".react-date-picker__inputGroup input[value='" + year + "']"))
//				.getDomProperty("value");
//		Assert.assertEquals(outputMonth, month);
//		Assert.assertEquals(outputYear, year);
//		Assert.assertEquals(outputDay, day);
//		System.out.println(outputMonth + "/" + outputDay + "/" + outputYear);
		List<WebElement> monthDayAndYearOutput = driver
				.findElements(By.cssSelector(".react-date-picker__inputGroup__input "));
		for (WebElement monthDayAndYear : monthDayAndYearOutput) {
			Assert.assertEquals(monthDayAndYear.getDomProperty("value"), dmy[i]);
			System.out.print(monthDayAndYear.getDomProperty("value") + "/");
			i++;
		}

	}

}
