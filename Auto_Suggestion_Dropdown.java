package com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.findElement(By.id("autosuggest")).sendKeys("ind");
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    List<WebElement> options =driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
    for(WebElement option : options)
    {
    	if(option.getText().equalsIgnoreCase("India"))
    	{
    	 	option.click();
    	 	break;
    	}
    	
    }
    
}
}
