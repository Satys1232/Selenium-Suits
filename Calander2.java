package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Calander2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
            "C:\\Users\\satya\\Desktop\\geckodriver-v0.36.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/flights/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the close button to be clickable and click it
        try {
            WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("span.commonModal__close")));
            closeBtn.click();

            // Wait until the popup is gone
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector("div.loginModal.displayBlock.modalLogin.dynHeight.personal")));
        } catch (Exception e) {
            System.out.println("Popup not found or already closed.");
        }

        // Now interact with the departure field
        WebElement departureInput = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("departure")));
        departureInput.click();

        // Wait for the calendar to appear and select the date
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("div[aria-selected='true']")));
        date.click();

        // Add any further steps as needed
    }
}
