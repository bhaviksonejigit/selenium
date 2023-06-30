package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable Present");
		}else {
			System.out.println("sortable Not Present");
		}
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Present");
		}
		
		driver.switchTo().frame(0); //index
		//driver.switchTo().frame("demo-frame"); //Works only with id or name. In this case we can not use it
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //Using WebElement
		System.out.println("------------------------------After Switching to Frame----------------------------------");
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable Present");
		}else {
			System.out.println("sortable Not Present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Present");
		}
		
		System.out.println("--------------------------------Switch to main page------------------------------------");
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable Present");
		}else {
			System.out.println("sortable Not Present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Present");
		}
		
		//driver.switchTo().parentFrame();

	}

}
