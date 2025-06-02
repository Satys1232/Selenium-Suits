package com;


import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// --- ChromeOptions to disable password manager and popups ---
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--incognito");
        //dhrome Driver options operations ends here
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		int i;
		String name = driver.findElement(By.cssSelector("div.form-group p")).getText();
        System.out.println(name);
        String first_Splitted_String [] = name.split("is");
        String second_Splitted_String[] = first_Splitted_String[1].split("and");
        String username = second_Splitted_String[0].trim();
        String password = first_Splitted_String[2].trim().replace(")", "");
        System.out.println("Username is :"+username+" "+"and"+" "+"password is :"+password);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='user']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
        driver.findElement(By.cssSelector("#okayBtn")).click();
        WebElement staticDropdown = driver.findElement(By.xpath("//div[@class='form-group']//select[@class='form-control']")); 
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer button"));
		for(i = 0 ; i < products.size();i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.cssSelector("li.nav-item.active a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Total']")));
		driver.findElement(By.cssSelector(".btn-success")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='Purchase']")));
		driver.findElement(By.cssSelector("#country")).sendKeys("in");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggestions a")));
		List<WebElement> countries = driver.findElements(By.cssSelector(".suggestions a"));
		for (WebElement country : countries) {
		    if (country.getText().trim().equalsIgnoreCase("India")) {
		        country.click();
		        break;
		    }
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".suggestions")));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#checkbox2")));
		driver.findElement(By.cssSelector("#checkbox2")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
		driver.findElement(By.cssSelector(".alert-success")).getText();

	}

}
