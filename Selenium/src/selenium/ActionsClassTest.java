package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		Actions builder = new Actions(driver);
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println(allLinks.size());
		
		/*for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}*/
		
		for(WebElement a : allLinks) {
			System.out.println(a.getText());
		}

	}

}
