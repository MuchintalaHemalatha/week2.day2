package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hema");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Latha");
		// Step 9: Enter the mobile number/email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Hema@gmail.com");		
		// Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("Hema12hma");	
		// Step 11: Handle all the three drop downs
		WebElement daydd = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dd1=new Select(daydd);
		dd1.selectByIndex(3);
		WebElement monthdd = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dd2=new Select(monthdd);
		dd2.selectByVisibleText("Nov");
		WebElement yeardd = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd3=new Select(yeardd);
		dd3.selectByValue("1994");


		// Step 12: Select the radio button "Female" 
		//( A normal click will do for this step)
		driver.findElement(By.className("_8esa")).click();
		//driver.findElement(By.xpath("//label[text()='Female']")).click();
		//label[text()='Female']/following-sibling:://input[@name='sex']
		System.out.println(driver.getTitle());
		driver.close();
	}

}
