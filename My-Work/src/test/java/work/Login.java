package work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='From']")).click();
	WebElement down=driver.findElement(By.xpath("//input[@placeholder='From']"));
	down.sendKeys("Mumbai");
	down.sendKeys(Keys.ARROW_DOWN);
	down.sendKeys(Keys.ENTER);
}
}