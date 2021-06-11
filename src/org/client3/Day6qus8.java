package org.client3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6qus8 {
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\Robot\\driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");

	WebElement txtlogin = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
	txtlogin.click();
	WebElement txtuser = d.findElement(By.xpath("(//input[@class='_2IX_2- _2LYh3d VJZDxU'])"));
    txtuser.sendKeys("arun");
    
    d.manage().window().maximize();
    Actions a=new Actions(d);
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_C);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_C);
    
    WebElement txtpass = d.findElement(By.xpath("(//input[@class='_2IX_2- _3mctLh VJZDxU'])"));
    txtpass.click();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
      
    
}
}
