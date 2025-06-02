package com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> it = winid.iterator();
		String parentid = it.next();
		String childid =  it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

	}

}
