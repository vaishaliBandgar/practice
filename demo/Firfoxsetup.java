package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firfoxsetup {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.edge.driver","C:\\Users\\bkban\\Downloads\\IEDriverServer_Win32_4.10.0\\IEDriverServer.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.amazon.com/");
//		System.out.println("hello");
//		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\bkban\\Desktop\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
	}

}
