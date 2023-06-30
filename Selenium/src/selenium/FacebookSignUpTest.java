package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("lastname")).sendKeys("sdgsagaerhgasdg");
		driver.findElement(By.name("reg_email__")).sendKeys("6475678793");
		driver.findElement(By.id("password_step_input")).sendKeys("dsagrehwrehrehg");
		
		//Select July
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		//Select 10
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByVisibleText("10");
		
		//Select 2000
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2000");
		
		//click on Radio Button
		
		driver.findElement(By.name("websubmit")).click();

	}

}
