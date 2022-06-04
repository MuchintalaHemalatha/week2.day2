package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Hemaa@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);	
		String firsteid = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')]/a")).getText();
		//firsteid means first email id
		System.out.println(firsteid);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')]/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		//confirm the duplicated lead name is same as captured name
		String dupname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		//dupname is duplicate name
		System.out.println(dupname);
		if (dupname.contains(firsteid)){
			System.out.println("Record ID has been Duplicated");
		}
		else {
			System.out.println("Record ID is not Duplicated");
		}
		driver.close();	






	}

}
