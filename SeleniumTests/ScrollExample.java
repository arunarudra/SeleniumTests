package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Table Rows']"));
		JavascriptExecutor obj = (JavascriptExecutor)driver;
		obj.executeScript("arguments[1].scrollIntoView();", element,element);
		
		

	}

}
