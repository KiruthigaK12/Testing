package com.Selenium.BasicApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Q2 {
	public static void main(String args[]) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver dr=new ChromeDriver();
	String url="https://demo.opencart.com/";
	dr.get(url);
	dr.findElement(By.xpath("//*[@id=\'search\']/button"));
	Thread.sleep(1000);
	dr.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a"));
	Thread.sleep(1000);
	dr.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]"));
	dr.quit();
	
	
	}
	
	

}
