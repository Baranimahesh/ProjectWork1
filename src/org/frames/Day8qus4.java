package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8qus4 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\Robot\\driver\\chromedriver.exe");
	WebDriver d2=new ChromeDriver();
	d2.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997/");
	d2.manage().window().maximize();
	//d2.switchTo().frame(frame);
	//WebElement elmswitch = d2.findElement(By.xpath(""));
	Actions a=new Actions(d2);

}
}