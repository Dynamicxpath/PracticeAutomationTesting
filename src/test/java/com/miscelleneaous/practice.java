package com.miscelleneaous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
	       WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	       searchbox.clear();
	       searchbox.sendKeys("iphone 13 ");
	       searchbox.submit();
	   
	       String text=driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight'] /ancestor::div[@class='sg-col-inner']/div[1]/div[1]//span[@class='a-price-whole']")).getText();
	       System.out.println(text);
	}
	

}
