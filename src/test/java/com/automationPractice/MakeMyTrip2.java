package com.automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com/");
		WebElement e = driver.findElement(By.xpath("//div[contains(@data-mode,'checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]"));
		 e.click();
		  Thread.sleep(5000);
		  
		  String flag = "False";
		 

		  while(flag=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'May 29 2022')]")).size()>0) {
		    
		   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'May 29 2022')]")).click(); 
		   flag="True";
		   Thread.sleep(5000);
		   }
		   
		   else {
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		      
		  }
		  
		  
		  System.out.println("Test case is passed");
		  driver.close();
		  
		    
		 }

		
}
	
	// //div[@class='bui-calendar__wrapper']/ancestor::div[@class='bui-calendar']

	




