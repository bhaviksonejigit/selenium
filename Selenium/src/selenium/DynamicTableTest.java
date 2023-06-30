package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://jqueryui.com/droppable/");
		
		//number of rows   //table[@id='customers']//tr
		//number of colms //table[@id='customers']//tr[2]/td
		
		for(int i=2; i<=7; i++) {
			
			for(int j=1; j<=3; j++) {
				
				System.out.println(i+"====="+j);
			}
		}
		
		

	}

}
