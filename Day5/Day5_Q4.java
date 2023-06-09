package com.Selenium.BasicApp.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Q4 {
	public static void main(String args[]) throws InterruptedException
	   {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://j2store.net/free/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		   Thread.sleep(1000);
		   driver.navigate().forward();
		   Thread.sleep(2000);
		   driver.navigate().back();
		   Thread.sleep(1000);
		   driver.navigate().refresh();
		   Thread.sleep(2000);
		   driver.quit();
		   
		   
		   
	   }

}
