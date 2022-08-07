package assignments;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session4 {
	
	WebDriver driver;
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void test() throws InterruptedException {
		
		//driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		WebElement USER_NAME_ELEMENT=driver.findElement(By.id("username"));
		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		
		//driver.findElement(By.id("password")).sendKeys("abc123");
		
		WebElement PASSWORD_ELEMENT=driver.findElement(By.id("password"));
		PASSWORD_ELEMENT.sendKeys("abc123");
		
		//driver.findElement(By.name("login")).click();
		
		WebElement LOGIN_ELEMENT=driver.findElement(By.name("login"));
		LOGIN_ELEMENT.click();
		
		//driver.findElement(By.xpath("//span[text()='Customers']")).click();
		
		WebElement CUSTOMER_ELEMENT=driver.findElement(By.xpath("//span[text()='Customers']"));
		CUSTOMER_ELEMENT.click();
		
		//driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		
		WebElement ADDCUSTOMER_ELEMENT=driver.findElement(By.xpath("//a[text()='Add Customer']"));
		ADDCUSTOMER_ELEMENT.click();
		
		//driver.findElement(By.id("account")).sendKeys("Amit Gupta");
		
		WebElement ACCOUNT_ELEMENT=driver.findElement(By.id("account"));
		ACCOUNT_ELEMENT.sendKeys("Amit Gupta");
		
		//driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		
		WebElement EMAIL_ELEMENT=driver.findElement(By.id("email"));
		EMAIL_ELEMENT.sendKeys("techfios123@gmail.com");
		
		//driver.findElement(By.id("phone")).sendKeys("7077077077");
		
		WebElement PHONE_ELEMENT=driver.findElement(By.id("phone"));
		PHONE_ELEMENT.sendKeys("2149997865");
		
		//driver.findElement(By.id("address")).sendKeys("2122 mirage blvd.");
		
		WebElement ADDRESS_ELEMENT=driver.findElement(By.id("address"));
		ADDRESS_ELEMENT.sendKeys("2122 mirage blvd.");
		
		//driver.findElement(By.id("city")).sendKeys("Dallas");
		
		WebElement CITY_ELEMENT=driver.findElement(By.id("city"));
		CITY_ELEMENT.sendKeys("Dallas");
		
		//driver.findElement(By.id("state")).sendKeys("Texas");
		
		WebElement STATE_ELEMENT=driver.findElement(By.id("state"));
		STATE_ELEMENT.sendKeys("Texas");
		
		//driver.findElement(By.id("zip")).sendKeys("88813");
		
		WebElement ZIP_ELEMENT=driver.findElement(By.id("zip"));
		ZIP_ELEMENT.sendKeys("88813");
		
		//driver.findElement(By.xpath("//span[text()='United States']"));
		
		WebElement COUNTRY_ELEMENT=driver.findElement(By.xpath("//span[text()='United States']"));
		
		
		//driver.findElement(By.id("currency")).click();
		
		WebElement CURRENCY_ELEMENT=driver.findElement(By.id("currency"));
		CURRENCY_ELEMENT.click();
		
		
		//driver.findElement(By.id("password")).sendKeys("Techfios123");
		
		WebElement PASSWORD_NEW_ELEMENT=driver.findElement(By.id("password"));
		PASSWORD_NEW_ELEMENT.sendKeys("Techfios123");
		
		//driver.findElement(By.id("cpassword")).sendKeys("Techfios123");
		
		WebElement C_PASSWORD_ELEMENT=driver.findElement(By.id("cpassword"));
		C_PASSWORD_ELEMENT.sendKeys("Techfios123");
		
		
		//driver.findElement(By.id("submit")).click();
		
		WebElement SUBMIT_ELEMENT=driver.findElement(By.id("submit"));
		SUBMIT_ELEMENT.click();
		
		
		Thread.sleep(7000);
		
		
		
		
		
	}
//	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
		
	}
	
	

}
