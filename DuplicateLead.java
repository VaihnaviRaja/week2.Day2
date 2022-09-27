package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
//		Click on Email
		driver.findElement(By.linkText("Email")).click();
//		9	Enter Email
		driver.findElement(By.xpath("//input[@id='ext-gen282']")).sendKeys("xyz@jd.com");
//		10	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
//		11	Capture name of First Resulting lead
		//driver.findElement(By.xpath("//a[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
//		12	Click First Resulting lead
		driver.findElement(By.xpath("//a[contains(text(),'Vaishu')]")).click();
//		13	Click Duplicate Lead
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
//		14	Verify the title as 'Duplicate Lead'
		System.out.println(driver.getTitle());
//		15	Click Create Lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
//		16	Confirm the duplicated lead name is same as captured name
		
//		17	Close the browser (Do not log out)

	}

}
