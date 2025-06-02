package com;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Addtocart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String vegetables[] = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot", };
		// add_Item_To_Cart(driver,vegetables);
		Addtocart order = new Addtocart();
		order.add_Item_To_Cart_And_Order(driver, vegetables);
		// it can be called as utility as it is taking care of everything.
	}

	// @SuppressWarnings("deprecation")
	public void add_Item_To_Cart_And_Order(WebDriver driver, String vegetables[]) {

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
		List<String> vegetableList = Arrays.asList(vegetables);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//  driver.findElement(By.xpath("//h4[text() = 'Cucumber - 1 Kg']/ancestor::div[@class ='product']//button[text()='ADD TO CART']")).click();
		int count = 0;
		for (int i = 0; i < products.size(); i++) {
			String arrName[] = products.get(i).getText().split("-");
			String formattedName = arrName[0].trim();
			if (vegetableList.contains(formattedName)) {
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (count == vegetables.length) {
					break;
				}

			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		// explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		String output = driver.findElement(By.cssSelector(".promoInfo")).getText();
		Assert.assertEquals(output, "Code applied ..!");

	}
}
