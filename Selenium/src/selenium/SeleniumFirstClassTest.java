package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClassTest {

	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //open Firefox
		driver.get("https://www.facebook.com/");  //Open Facebook
		
		driver.findElement(By.id("email")).sendKeys("fsdagsdagarwharyherteryw"); //type wrong email id
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		driver.findElement(By.id("pass")).sendKeys("asdgfsdagsdgsrhsah");//type wrong password
		driver.findElement(By.name("login")).click(); //click on login button

	}

}
