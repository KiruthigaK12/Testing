package com.Selenium.BasicApp.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Q2 {

	public static void main(String[] args) throws InterruptedException
	{
		
          WebDriverManager.chromedriver().setup();
          WebDriver dr=new ChromeDriver();
          String url="https://j2store.net/free/";
          dr.get(url);
          String curl=dr.getCurrentUrl();
          if(curl.equals("https://j2store.net/free"))
          {
        	  System.out.println("Valid");
        	  
          }
          else
          {
        	  System.out.println("Invalid");
        	  
          }
          dr.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img"));
          String curl1=dr.getCurrentUrl();
          if(curl1.equals("https://j2store.net/free/"))
         {
        	  System.out.println("Valid");
        	  
          }
          else
          {
        	  System.out.println("Invalid");
        	  
          }
          
          
	}

}
