package Contact_us;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=information/contact");
		driver.manage().window().maximize();
		
		WebElement Name;
		Name = driver.findElement(By.id("input-name"));
		Name.sendKeys("Muhammad Adnan Adil");
		
		WebElement Email;
		Email = driver.findElement(By.id("input-email"));
		Email.sendKeys("adnan.adil@gmail.com");
		
		WebElement Enquiry;
		Enquiry = driver.findElement(By.id("input-enquiry"));
		Enquiry.sendKeys("This is test message");
		
		WebElement Submitbtn;
		Submitbtn = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input"));
		Submitbtn.click();
		
		WebElement contButton;
		contButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
		contButton.click();
		
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
	
		driver.close();
		
	}

}
