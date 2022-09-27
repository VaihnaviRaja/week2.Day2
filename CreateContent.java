package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Riya");
		 driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("A");
		 driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Tester");
		 driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("ManualTester");
		 //driver.findElement(By.xpath("//input[@id='createContactForm_description']")).sendKeys("ManualTester");
		 driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("xyz@sd.com");
		 WebElement findElement = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")); 
		 Select s= new Select(findElement);
		 s.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click(); 
		 driver.findElement(By.xpath("//a[@class='subMenuButton']")).click(); 
		 driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear(); 
		 driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Tester"); 
		  driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		  System.out.println(driver.getTitle());

	}

}
