package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//Have to check why below one didnt work
		//driver.findElement(By.xpath("//label[text()='First name:']/following::input[@class=' x-form-text x-form-field ']")).sendKeys("Sreelekshmi");
		driver.findElement(By.xpath("(//label[text()='First name:']/following::input[@name='firstName'])[3]")).sendKeys("Sreelekshmi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("RBS");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Confirm the changed name appears
		//creating a particular webelement for updated companyname 
		WebElement newcomname = driver.findElement(By.id("viewLead_companyName_sp"));
		//getting a text using getText() and stored into chname 
		String chname = newcomname.getText();
		System.out.println(chname);
		if(chname.contains("RBS"))
		{
			System.out.println("Name has been changed to:"+chname);
		}
		else
		{
			System.out.println("No changes happened");
		}
		
		driver.close();
		








	}

}
