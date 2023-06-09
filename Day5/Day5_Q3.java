package com.Selenium.BasicApp.Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day5_Q3 {
	
		public static void main(String args[])
		{
	
	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

    // Create a new instance of the Chrome driver
    WebDriver driver = new ChromeDriver();

    // Open the webpage
    driver.get("https://j2store.net/free/");

    // Click on the Clothing link
    WebElement clothingLink = driver.findElement(By.linkText("Clothing"));
    clothingLink.click();

    // Wait for the page to load
    //WebDriverWait wait = new WebDriverWait(driver, 10);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("item-name")));

    // Find and print the names of the items displayed on the screen
    List<WebElement> itemNames = driver.findElements(By.className("item-name"));
    for (WebElement itemName : itemNames) {
        System.out.println(itemName.getText());
    }

    // Close the browser
    driver.quit();

}
