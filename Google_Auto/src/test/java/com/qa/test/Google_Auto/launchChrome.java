package com.qa.test.Google_Auto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Google_Auto/Library/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		String Google = "https://www.google.com";
		
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.navigate().to("https://www.amazon.in");
		
		driver.navigate().back();

		driver.get(Google);
				
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
