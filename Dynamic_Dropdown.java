package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	// XPATH FOR CHENNAI - //a[@value='MAA']
	//a[@value='BLR'] FOR BENGALURU , 
	//a[@text ='Bengaluru (BLR)'] // by name.
	driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value ='BLR']")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] // a[@value='GOI']")).click();
	// BY DOING WITH PARENT CHILD RELATIONSHIP
	
	
	
	
}
}
