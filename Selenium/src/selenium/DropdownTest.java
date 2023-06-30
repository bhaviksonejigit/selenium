package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(15000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++) {
			if(allOptions.get(i).isSelected()) {
			System.out.println(allOptions.get(i).getText()+"-----"+allOptions.get(i).isSelected());
		}
		}
		
		WebElement dropDown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropDown);
		
		s.selectByIndex(1); //Antiques
		Thread.sleep(4000);
		
		s.selectByValue("2984"); //Baby
		Thread.sleep(4000);
		
		s.selectByVisibleText("Books"); //Books
		System.out.println("-----------------------After Selection--------------------------------");
		
		for(int i=0; i<allOptions.size();i++) {
			if(allOptions.get(i).isSelected()) {
			System.out.println(allOptions.get(i).getText()+"-----"+allOptions.get(i).isSelected());
		}
		}

	}

}
