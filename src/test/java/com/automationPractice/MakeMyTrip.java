package com.automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		 WebElement e = driver.findElement(By.xpath("//div[contains(@data-mode,'checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]"));
		 e.click();
		while(!driver.findElement(By.xpath("//div[@class='bui-calendar__wrapper']/ancestor::div[@class='bui-calendar']")).getText().contains("May"))
				{
				  driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']//*[name()='svg']")).click();
				}
		List<WebElement> d =driver.findElements(By.xpath("//table/tbody/tr/td"));
	//List<WebElement> d = driver.findElements(By.className("bui-calendar__row"));
		for (int i = 0; i<d.size(); i++) {
	         //check expected data
	         String s = d.get(i).getText();
	         System.out.println(s);
             if (s.equals("29")) {
            d.get(i).click();
	            break;
             }
		}
//	            String m = e.getAttribute("value");
//	            System.out.print("Date selected in calendar is: "+ m);
}
	
	 //div[@class='bui-calendar__wrapper']/ancestor::div[@class='bui-calendar']
//div[@class='bui-calendar__wrapper']/ancestor::div[@class='bui-calendar']
	
}



