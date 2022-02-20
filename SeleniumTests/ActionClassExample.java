package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement from = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		action.contextClick();

	}

}
