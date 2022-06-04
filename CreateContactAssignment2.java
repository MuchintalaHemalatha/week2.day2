package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement eleUserName= driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Hema");
		driver.findElement(By.id("lastNameField")).sendKeys("Hemaa");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ongole_Hema");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Andhra_Hema");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Engineering");
		driver.findElement(By.id("createContactForm_description")).sendKeys("All is Well");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Hema@gmail.com");
		WebElement eledd = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select statedd=new Select(eledd);
		statedd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Thank u");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());



	}

}


