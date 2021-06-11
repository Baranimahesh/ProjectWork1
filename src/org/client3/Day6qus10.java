package org.client3;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6qus10 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\Robot\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		 d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  
		WebElement txtgras = d.findElement(By.xpath("(//div[@class='CXW8mj'])[2]"));
		txtgras.click();
	    Actions a=new Actions(d);
		//a.contextClick().perform();
       
	}
}