package com.miscelleneaous;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMTLocationAutoamtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		List<WebElement> listofcity = driver.findElements(By.xpath("//input[@placeholder='From']"));
		
		
		for(WebElement list:listofcity)
		{
			String Texts=list.getText();
			System.out.println(Texts);
		}
		
	}

}
