package SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	/*	WebElement ele = driver.findElement(By.xpath("//*[@id='alertButton']"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.accept(); */
		
	/*	WebElement ele1 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		ele1.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss(); */
		
		//driver.navigate().refresh();
		WebElement elem = driver.findElement(By.xpath("//button[@id='promtButton']"));
		elem.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("Enter some Text");
		alert2.accept();
	//	driver.close();
		

	}

}
