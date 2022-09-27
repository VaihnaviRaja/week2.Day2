package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/chennai/in");
		driver.manage().window().maximize();
//		boolean enabled = driver.findElement(By.xpath("//div[contains(text(),'button')]")).isEnabled();
//		System.out.println(enabled);
		driver.findElement(By.xpath("//span[contains(text(),'Round')]")).click();
		driver.findElement(By.xpath("//div[@class='placeholder']")).sendKeys("Airport");
//		boolean enabled1 = driver.findElement(By.xpath("//div[contains(text(),'button')]")).isEnabled();
//		System.out.println(enabled1);
		driver.findElement(By.xpath("//div[contains(text(),'button')]")).click();		
	}

}
