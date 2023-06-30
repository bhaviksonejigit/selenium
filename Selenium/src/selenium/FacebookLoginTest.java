package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLoginTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//1.className (Class Attribute). Not working //can not use className when class value has a space
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sadgeysryerwyhetrhyt");
		
		//2. cssSelector //Needs to learn syntax for CSs
		//driver.findElement(By.cssSelector(null)).sendKeys("sadgeysryerwyhetrhyt");
		
		//3. id (id attribute) - working
		//driver.findElement(By.id("email")).sendKeys("fsadgsghsrhgthar");
		
		//4.linkText - only for links
		//driver.findElement(By.linkText(null))
		
		//5. name (name attribute) - working
		//driver.findElement(By.name("email")).sendKeys("dsagsafhgrshgdshg");
		
		//6.partialLinkText - only for links
		//driver.findElement(By.partialLinkText(null))
		
		//7. tagName - not unique
		//driver.findElement(By.tagName("input")).sendKeys("sdagfsgsdfherh");
		
		//8.xpath //Needs to learn syntax for CSs
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("sdagfsgsdfherh");
		
		//PASSWORD
		driver.findElement(By.name("pass")).sendKeys("fsdagsadhgr");
		
		//LoginButton
		driver.findElement(By.tagName("button")).click();

	}

}
