package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {

		// ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver(); 
		
		//ParentClass(Interface)Name objName = new ClassName();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/"); 

		driver.findElement(By.id("email")).sendKeys("fsdagsdagarwharyherteryw"); 
		driver.findElement(By.id("pass")).sendKeys("asdgfsdagsdgsrhsah");
		driver.findElement(By.name("login")).click(); 

	}

}
