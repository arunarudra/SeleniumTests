package SeleniumTests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		newWindow.click();
		Set <String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		
		while(itr.hasNext()) {
			String current = itr.next();
			if(!current.equals(parentWindow)) {
				driver.switchTo().window(current);
				WebElement header = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				if (header.getText().equals("This is a sample page")) {
					System.out.println("Test ase passed");
				}
				driver.close();
			}
		

	}

	}
}
