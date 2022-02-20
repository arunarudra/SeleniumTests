package SeleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookLogin {

	public static void main(String[] args) {
	//	ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver","geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver,40);
			
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));	
		
		username.sendKeys("aruna.rudrabhatla@gmail.com");
		password.sendKeys("Newsign0np@55word");
		
		loginbtn.click();
		
		WebElement menu= driver.findElement(By.cssSelector("div[aria-label='Account'][role='button']"));
		menu.click();
		
				
		WebElement logout = driver.findElement(By.xpath("//span[normalize-space()='Log Out']"));
		logout.click();
		
		
		driver.close();

	}

}
