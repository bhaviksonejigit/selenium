package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHf-bZ7l-jbPR7xrbutK3SbxEuSicWf-WemSeqxA_0XzJLeXWcXSM9sDhEmuvvrd8l5vBvm-KQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow); //Needs to pass Window Handle here
		System.out.println(driver.getTitle()); //Title for Help page
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle()); //Title for Gmail page

	}

}
