package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
        WebElement AutomationCheckbox = driver.findElement(By.cssSelector("form input[class='Automation']"));
//        System.out.println(driver.findElement(By.cssSelector("form input[class='Automation']")).isSelected());
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("alert('Hello from Selenium!');");
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        js.executeScript("arguments[0].scrollIntoView(true);", AutomationCheckbox);
        Assert.assertFalse(driver.findElement(By.cssSelector("form input[class='Automation']")).isSelected());
        AutomationCheckbox.click();
//        System.out.println(driver.findElement(By.cssSelector("form input[class='Automation']")).isSelected());
//        System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());  
        Assert.assertTrue(driver.findElement(By.cssSelector("form input[class='Automation']")).isSelected());
        driver.findElement(By.cssSelector("div h1")).getText();
        Assert.assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Sample Webpage for Automation Practice");
//        try 
//        {
//			Thread.sleep(2000);
//		   } catch (InterruptedException e) 
//         {
//		    TODO Auto-generated catch block
//			e.printStackTrace();
//		   }
        
	}
}
