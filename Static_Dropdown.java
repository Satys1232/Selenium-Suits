package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//dropdown with select tag
	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
	Select dropdown = new Select(staticDropdown);
	// it expects an argument to match
	// now we have to tell where does exactly the select dropdown
	// is present , so to tell where exactly it is we have 
	// to give the web element of that dropdown.
	// for that we need to create an webelement.
	dropdown.selectByIndex(3);// index - 3 
	// it will only work if select tag is there .
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	// this will select text whose text which visible text is 
	//exactly AED.
	// it is a way to select element on that index.
	// we have selected index 3 but we need to verify that 
	// we have selected button 3.
	dropdown.selectByValue("INR");
	// to select it by value.
	System.out.println(dropdown.getFirstSelectedOption().getText());
	//UPDATED DROPDOWN.
	
}
}
