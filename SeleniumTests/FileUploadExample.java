package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement fileUpload = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		fileUpload.sendKeys("D:\\testingData1.xlsx");
		WebElement Tnc = driver.findElement(By.id("terms"));
		Tnc.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();
		
		driver.close();

	}

}
