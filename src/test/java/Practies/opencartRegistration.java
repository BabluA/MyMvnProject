package Practies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencartRegistration {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='nav float-end']//div[@class='dropdown']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("lkiufh");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("njufvyw");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("cnjkir345@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("nvfopsw123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

	}

}
