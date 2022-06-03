package com.automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
	       WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	       searchbox.clear();
	       searchbox.sendKeys("iphone");
	       List<WebElement> links = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
	       System.out.println(links.size());
	       for(WebElement a:links)
	       {
	    	   System.out.println(a.getText());
	    	   String text=a.getText();
	    	   if(text.equalsIgnoreCase("iphone 12"))
	    	   {
	    		  a.click();
	    		  break;
	    	   }
	       }
	    	   
		}

	}


