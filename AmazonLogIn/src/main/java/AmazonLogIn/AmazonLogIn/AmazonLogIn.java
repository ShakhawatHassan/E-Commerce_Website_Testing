package AmazonLogIn.AmazonLogIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogIn {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tokid\\eclipse-workspace\\AmazonLogIn\\Driver\\chromedriver.exe");
	WebDriver Chrome = new ChromeDriver ();

Chrome.get ("https://www.amazon.com/ref=ap_frn_logo");
Chrome.manage().window().maximize();
Thread.sleep(100);
Chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement SignIn = Chrome.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
SignIn.click();


WebElement Email = Chrome.findElement(By.xpath("//*[@id=\"ap_email\"]"));
Email.sendKeys("Tokid.sh@gmail.com");
WebElement Password = Chrome.findElement(By.xpath("//*[@id=\"ap_password\"]"));
Password.sendKeys("sht204077");
WebElement Submit = Chrome.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
Submit.click();
}
}
