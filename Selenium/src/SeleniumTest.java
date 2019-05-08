import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {


public static void main (String[] args) throws InterruptedException{
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver1= new ChromeDriver ();
driver1.get ("http://newtours.demoaut.com/");
driver1.manage().window().maximize();
Thread.sleep(3000);
driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement userName = driver1.findElement(By.name("userName"));
userName.sendKeys("admin");
WebElement password = driver1.findElement(By.name("password"));
userName.sendKeys("password");
Thread.sleep(3000);

driver1.close();
}
}