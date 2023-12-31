package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?guccounter=1");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@role='presentation']/li/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}

	}

}
