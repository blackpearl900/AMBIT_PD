package oder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ordering {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		
		
		WebElement Login;
		Login = driver.findElement(By.id("input-email"));
		Login.sendKeys("adnan.adil900@yahoo.com");		
		
		WebElement loginPassword;
		loginPassword = driver.findElement(By.id("input-password"));
		loginPassword.sendKeys("1234567890");

		WebElement Logintbtn;
		Logintbtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		Logintbtn.click();
		
		driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=hp");
		
		WebElement AddtoCart;
		AddtoCart = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
		AddtoCart.click();
		
		
		WebElement checkoutbtn;
		checkoutbtn = driver.findElement(By.xpath("//*[@id=\"cart-total\"]")); 
		checkoutbtn.click();
		
		
		WebElement checkoutdone;
		checkoutdone = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
		checkoutdone.click();
		

	}

}
