package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); //About Page Title
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); //Google Page Title
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); //About Page Title
	}

}
