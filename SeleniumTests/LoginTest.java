package SeleniumTests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","geckodriver.exe");
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver,40);
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		wait.until(ExpectedConditions.elementToBeClickable(loginLink));
		loginLink.click();
		
		WebElement username = driver.findElement(By.name("user_login"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbtn = driver.findElement(By.name("btn_login"));
		WebElement chkbox = driver.findElement(By.className("rememberMe"));
		
		
		username.sendKeys("aruna.rudra765@gmail.com");
		password.sendKeys("N0newp@55word");
		chkbox.click();
		loginbtn.click();
		WebElement errormsg =driver.findElement(By.id("msg_box"));
		
		String msg = errormsg.getText();
		String expmsg = "The email or password you have entered is invalid.";
		if (msg.equals(expmsg)) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case failed");
		}
	
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement list1:links) {
			System.out.println(list1.getAttribute("href"));
		}
		
		
			driver.close();
		
		
	}

}
