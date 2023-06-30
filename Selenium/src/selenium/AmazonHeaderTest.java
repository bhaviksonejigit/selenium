package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		Thread.sleep(5000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}

	}

}
