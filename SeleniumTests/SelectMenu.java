package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		//Select select = new Select(driver.findElement(By.xpath("(//select)[1]")));
		Select select = new Select(driver.findElement(By.xpath("//select[1]/option[@value='IND']")));
		//System.out.println(select.getText());
		//select.selectByIndex(2);
		List<WebElement> l1= select.getOptions();
		for(WebElement e1:l1) {
		System.out.println(e1.getText());
		
	}
		driver.close();

	}

}
