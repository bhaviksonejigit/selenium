package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("https://www.ebay.ca/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement footer =driver.findElement(By.xpath("//body[@class='desktop gh-flex']/div[@id='hlGlobalFooter']/footer[@id='glbfooter']/div[@id='gf-BIG']/table[@class='gf-t']/tbody/tr/td[1]"));
		List<WebElement> list=footer.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
		System.out.println(list.get(i).getText());
		}
	}
	
}
