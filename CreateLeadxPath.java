package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadxPath {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement eleUserName= driver.findElement(By.xpath("//input[@id='username']"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("RBS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hema");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Latha");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Hem");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Ongole");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("All is Well");
		driver.findElement(By.xpath("createLeadForm_primaryEmail")).sendKeys("Hema@gmail.com");
		WebElement ele=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select city=new Select(ele);
		city.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();


	}

}
