package com;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Advanced {

    // Step 1: Define the EventHandler as a nested class
    public static class EventHandler extends AbstractWebDriverEventListener {
        @Override
        public void afterClickOn(WebElement element, WebDriver driver) {
            System.out.println("✅ Clicked on element: " + element);
        }

        @Override
        public void beforeNavigateTo(String url, WebDriver driver) {
            System.out.println("🌐 Navigating to: " + url);
        }

        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            System.out.println("❌ Exception: " + throwable.getMessage());
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\satya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Step 2: Create the original driver
        WebDriver baseDriver = new ChromeDriver();

        // Step 3: Wrap it with EventFiringWebDriver
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(baseDriver);

        // Step 4: Register the event handler
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);

        // Step 5: Use eventDriver for automation
        eventDriver.get("https://www.google.com"); // Triggers beforeNavigateTo()

        // Example action to test click logging
        try {
            WebElement searchBox = eventDriver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium");
            searchBox.submit(); // May trigger afterClickOn() if submit() uses a click
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");
        }

        // Step 6: Cleanup
        eventDriver.unregister(handler);
        eventDriver.quit();
    }
}
