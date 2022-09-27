package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Aishu");
		driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Vaishu')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("LeadTest.org");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp'")).getText();
		driver.close();
		
	}

}
