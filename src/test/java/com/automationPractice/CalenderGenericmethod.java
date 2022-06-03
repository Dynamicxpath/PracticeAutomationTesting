package com.automationPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderGenericmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		 WebElement e = driver.findElement(By.xpath("//div[contains(@data-mode,'checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]"));
		 e.click();
		  Calendar cal=Calendar.getInstance();
		   Date currentDate=cal.getTime();
		   System.out.println(currentDate);
		   SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		   String modifiedDate=sdf.format(currentDate);
		   System.out.println(modifiedDate);
		   driver.findElement(By.xpath("//table/tbody/tr/td")).sendKeys(modifiedDate,Keys.ESCAPE);
		 
	}

}
