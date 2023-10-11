package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q3_Chrome_Wikipedia {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.wikipedia.org/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id ='searchInput']"));
		searchbox.sendKeys("Artificial Intelligence");
		
		WebElement searchclick =  driver.findElement(By.xpath("//*[text()='Search']"));
		searchclick.click();

		//Absolute Xpath Used
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]"));
		Title.click(); 
		String pagetitle =driver.findElement(By.id("History")).getText();
		System.out.println("Selected section Title is : " +pagetitle);
	}
}
