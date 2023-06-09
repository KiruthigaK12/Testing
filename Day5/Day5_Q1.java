package com.Selenium.BasicApp.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Q1 {
	
		public static void main(String args[]) throws InterruptedException
		{
			
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		String url="https://j2store.net/free/";
		dr.get(url);
		String title=dr.getTitle();
		if(title.equalsIgnoreCase("Home"))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
        dr.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        String title1=dr.getTitle();
        if(title1.equalsIgnoreCase("Shop"))
        {
        	System.out.println("Valid");	
        }
        else
        {
        	System.out.println("Invalid");
        }
		dr.quit();
		//Thread.sleep(5000);
		
	}

}
