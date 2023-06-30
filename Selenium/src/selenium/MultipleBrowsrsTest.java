package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsrsTest {

	public static void main(String[] args) {

		WebDriver driver;
		String browser = "Firefox"; //Firefox, Chrome, Safari //Read this value from data file, Excel or Properties
		
		if(browser.equals("Firefox")) {
			driver = new FirefoxDriver(); 
		}else if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new SafariDriver();
		}
		driver.get("https://www.facebook.com/"); 

		driver.findElement(By.id("email")).sendKeys("fsdagsdagarwharyherteryw");
		driver.findElement(By.id("pass")).sendKeys("asdgfsdagsdgsrhsah");
		driver.findElement(By.name("login")).click(); 

	}

}
