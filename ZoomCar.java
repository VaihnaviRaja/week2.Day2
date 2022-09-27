package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/chennai");
		driver.manage().window().maximize();
//		boolean enabled = driver.findElement(By.xpath("//div[contains(text(),'button')]")).isEnabled();
//		System.out.println(enabled);
		driver.findElement(By.xpath("//i[@class='z-swap']")).click();
		driver.findElement(By.xpath("//div[@class='placeholder']")).click();
//		WebElement enabled1 = driver.findElement(By.xpath("//div[contains(text(),'button')]"));
//		boolean val=enabled1.isEnabled();
//		System.out.println(val);
		driver.findElement(By.xpath("//div[contains(text(),'button')]")).click();		
	}

}
