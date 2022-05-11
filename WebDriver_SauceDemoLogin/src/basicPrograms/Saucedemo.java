package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize(); 
		//User-Name
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				//Password
				driver.findElement(By.name("password")).sendKeys("secret_sauce");
				//Login-Button
				driver.findElement(By.id("login-button")).click();
		
	
	}

}
