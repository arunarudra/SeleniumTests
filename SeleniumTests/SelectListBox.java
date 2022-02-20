package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectListBox {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		Select listbox = new Select(driver.findElement(By.id("multiselect")));
		listbox.selectByIndex(1);
		listbox.deselectByVisibleText("suzuki");
		List<WebElement> l1= listbox.getOptions();
		
		//listbox.deselectByValue("Opel");
		//Select noSelection = new Select(driver.findElement(By.xpath("//select[@id='multiselect']/option[@value='opel']")));
		//noSelection.d
		for(WebElement e1:l1) {
			
		System.out.println(e1.getText());

}
		driver.close();
	}
}
