package org.client3;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Client3 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\selenium3\\driver3\\chromedriver.exe");
			
			WebDriver d2=new ChromeDriver();
			d2.get("https://infinity.icicibank.com/corp/login.jsp");
			d2.manage().window().maximize();
			
			String title=d2.getTitle();
			System.out.println(title);
			String currentUrl = d2.getCurrentUrl();
			System.out.println(currentUrl);
			
			//d2.close();
			WebElement txt=d2.findElement(By.id("email"));
			txt.sendKeys("mahesh");
			
			WebElement txt1=d2.findElement(By.id("pass"));
			txt1.sendKeys("1234567");
		
		}

	}


