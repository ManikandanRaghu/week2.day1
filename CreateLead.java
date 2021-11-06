package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("7th Gen Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raghu");
		driver.findElement(By.name("submitButton")).click();
		//Updating the created lead by clicking on EDIT
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_firstNameLocal")).sendKeys("Mani");
		driver.findElement(By.id("updateLeadForm_lastNameLocal")).sendKeys("R");
		//driver.findElement(By.id("addDataSourceForm_dataSourceId")).sendKeys("LEAD_OTHER");//Dropdown field
		//driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Browser page title is: "+title);
		String text = driver.findElement(By.id("viewLead_statusId_sp")).getText();
		System.out.println("Status is : "+text);
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name : "+text2);
		driver.findElement(By.linkText("opentaps")).click();
		driver.close();	

	}

}
