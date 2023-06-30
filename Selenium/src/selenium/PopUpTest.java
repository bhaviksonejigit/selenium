package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		//if Popup available ---> Close Popup ---> Type computer in the box
		//if No Popup ---> https://www.aliexpress.com/
		
		//Wnen you run 50% times, you get get the popup, 50% don't get the popup
	}

}
