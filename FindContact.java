package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Enter Username and Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Contacts tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Find Contacts and search using email
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//Clicking on Email tab using XPATH
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("manikandan@yopmail.com");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		System.out.println("Data Found");
		driver.close();
	}

}
