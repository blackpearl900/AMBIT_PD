package Assignmentone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		
		String actualpagetitle = driver.getTitle();
		String expectedtitle = "Register Account";
		
		
		if (actualpagetitle.contentEquals(expectedtitle))
		{
			
			WebElement FirstName;
			FirstName = driver.findElement(By.id("input-firstname"));
			FirstName.sendKeys("Muhammad Adnan");
			
			WebElement Lastname;
			Lastname = driver.findElement(By.id("input-lastname"));
			Lastname.sendKeys("Adil");
			
			WebElement email;
			email = driver.findElement(By.id("input-email"));
			email.sendKeys("adnan.adil@yahoo.com");
			
			WebElement Phone;
			Phone = driver.findElement(By.id("input-telephone"));
			Phone.sendKeys("03337042374");
			
			WebElement Password;
			Password = driver.findElement(By.id("input-password"));
			Password.sendKeys("1234567890");
			
			WebElement ConPassword;
			ConPassword = driver.findElement(By.id("input-confirm"));
			ConPassword.sendKeys("1234567890");
			
			WebElement Checkbox;
			Checkbox = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
			Checkbox.click();
			
			
			WebElement ContinueButton;
			ContinueButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
			ContinueButton.click();
			
			WebElement Continuebtn;
			Continuebtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
			Continuebtn.click();
			
			WebElement dropdown;
			dropdown = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
			dropdown.click();
			
			WebElement logoutbtn;
			logoutbtn = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
			logoutbtn.click();
			
			WebElement conbtnafterlogout;
			conbtnafterlogout = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
			conbtnafterlogout.click();
			
			
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			
			WebElement Login;
			Login = driver.findElement(By.id("input-email"));
			Login.sendKeys("adnan.adil@yahoo.com");		
			
			WebElement loginPassword;
			loginPassword = driver.findElement(By.id("input-password"));
			loginPassword.sendKeys("1234567890");
			
			WebElement Logintbtn;
			Logintbtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			Logintbtn.click();
			
			driver.close();
			
			
		}
		else
		{
			System.out.println("Test Failed");
		}
		


	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}

}
