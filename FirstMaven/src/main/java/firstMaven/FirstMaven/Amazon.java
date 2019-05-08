package firstMaven.FirstMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main (String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tokid\\eclipse-workspace\\FirstMaven\\driver\\chromedriver.exe");
	WebDriver driver1= new ChromeDriver ();
	driver1.get ("http://newtours.demoaut.com/");
	driver1.manage().window().maximize();
    driver1.quit();
	
	}
}