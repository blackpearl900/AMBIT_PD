package Assignmentone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://172.30.106.102:8085/Unison/jsp/login/login.jsf");
		driver.manage().window().maximize();
		
		
		String actualpagetitle = driver.getTitle();
		String expectedtitle = "Login Page";
		
		if (actualpagetitle.contentEquals(expectedtitle))
		{
			WebElement username;
			username = driver.findElement(By.id("loginForm:LoginId"));
			username.sendKeys("admin");
			
			WebElement Password;
			Password = driver.findElement(By.id("loginForm:pass"));
			Password.sendKeys("");
			
			WebElement loginButton;
			loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm:loginSubmitButton\"]"));
			loginButton.click();
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		


	}

}
