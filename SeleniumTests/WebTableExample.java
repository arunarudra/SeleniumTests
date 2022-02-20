package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> trRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement> tcColms = driver.findElements(By.xpath("//table[@id='customers']//th"));
		//getting data from 3rd row
	//	List<WebElement> tdata = driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		//Object[][] arr1 = new Object[][](tdata);
		//getting data in the first column
		List<WebElement> tcdata = driver.findElements(By.xpath("//table[@id='customers']//th[1]/td"));
		System.out.println("total rows are " + trRows.size());
		System.out.println("total rows are " + tcColms.size());
	/*	for (WebElement data:tdata) {
			System.out.print(data.getText() + "  ");
		} */
		
		for (WebElement coldata:tcdata) {
			System.out.println(coldata.getText() + "  ");
		}
		
	/*	for (int i=1; i<trRows.size();i++) {
			List<WebElement> tdata = driver.findElements(By.xpath("//table[@id='customers']//tr[i]/td"));
			for(int j=0;j<tcColms.size();j++) {
				List<WebElement> tcdata = driver.findElements(By.xpath("//table[@id='customers']//tr/td[j]"));
				System.out.println(tdata);
			}
		} */
		
		driver.close();
		//table[@id='customers']/tbody/tr

	}

}
