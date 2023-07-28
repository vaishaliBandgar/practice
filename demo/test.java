package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://chromedriver.chromium.org/");
		driver.get("https://www.redbus.com/");

	}
}
