package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		
		//Fill Contact form details
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Manikandan");
		driver.findElement(By.id("lastNameField")).sendKeys("Raghu");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mani");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("manikandan@yopmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		//Print First, last name and Browser title
		String title = driver.getTitle();
		System.out.println("Browser Title is : "+title);
		String name = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("Full name : "+name);
		String fname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("First name : "+fname);
		String lname = driver.findElement(By.id("viewContact_lastNameLocal_sp")).getText();
		System.out.println("Last name : "+lname);
		driver.close();
		

	}

}
