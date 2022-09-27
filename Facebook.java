package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://www.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aishw");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("919789661351");
		// Step 10: Enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("*A1bc");
		// Step 11: Handle all the three drop downs
		WebElement findElement = driver.findElement(By.xpath("//span[@id='day']"));
		Select s= new Select(findElement);
		s.selectByValue("3");
		WebElement find = driver.findElement(By.xpath("//span[@id='month']"));
		Select s2 = new Select(find);
		s2.selectByIndex(0);
		WebElement year = driver.findElement(By.xpath("//span[@id='Year']"));
		Select s3= new Select(year);
		s3.selectByVisibleText("2007");	
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		            //( A normal click will do for this step) 

	}

}
