package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(3000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}

	}

}
