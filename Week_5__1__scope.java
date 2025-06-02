package com;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week_5__1__scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// give me the count of links on the page
		driver.get("https://www.tutorialspoint.com/");
		WebElement footerDriver = driver.findElement(By.cssSelector("footer"));
		WebElement columnDriver = footerDriver
				.findElement(By.xpath("//h5[1]/ancestor::div[@class='container']/div[1]"));
		List<WebElement> links = columnDriver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
			wait.until(ExpectedConditions.elementToBeClickable(link));
			String script = "var evt = document.createEvent('MouseEvents');"
					+ "evt.initMouseEvent('click', true, true, window, 0, 0, 0, 0, 0, true, false, false, false, 0, null);"
					+ "arguments[0].dispatchEvent(evt);";
			((JavascriptExecutor) driver).executeScript(script, link);
		}
		int count = 0;
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				String title = driver.getTitle();
				System.out.println("Title of child window is: " + title);
				count++;
			}

		}
		System.out.println(count + " Tabs Opened");
	}

}
