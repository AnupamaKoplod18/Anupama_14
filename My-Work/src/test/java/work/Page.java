package work;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Page {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
