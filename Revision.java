package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {
	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.artsy.net/");
		driver.findElement(By.xpath("//div/a[@class='RouterLink__RouterUnawareLink-sc-77e33c7f-1 NavBarItem__NavBarItemLink-sc-13290279-0 dPtbff dJlVYu' and @data-label='Buy']")).click();
	}

}
