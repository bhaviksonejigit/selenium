package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		
		Thread.sleep(3000);
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle(); //read the title from web page
		System.out.println(actualTitle);
		
		String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl = driver.getCurrentUrl(); //read the current url from the browser
		System.out.println(actualUrl);
		
		if(expectedTitle.equals(actualTitle) & expectedUrl.equals(actualUrl)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}

	}

}
