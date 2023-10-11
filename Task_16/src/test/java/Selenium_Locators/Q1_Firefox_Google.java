package Selenium_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1_Firefox_Google {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		System.out.println(driver);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://google.com");
		
		String URL = driver.getCurrentUrl();
		System.out.println("URL name is :" + URL);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
