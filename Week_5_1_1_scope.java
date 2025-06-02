package com;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week_5_1_1_scope {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// give me the count of links on the page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		WebElement columnDriver = footerDriver
				.findElement(By.xpath("(//div[@id='gf-BIG']/table/tbody/tr/td/ul)[1]"));
		//List<WebElement> links = columnDriver.findElements(By.tagName("a"));
		for(int i = 0; i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnIcon = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnIcon);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println("Title of the page is :"+driver.getTitle());
		}
		
	}

}
