
//We don't need main method here if we are using J-Unit ,that is 
//the reason we don't run as java program, we run program as J-unit
//and that is the reason we need Maven here, alone selenium is
//not eoungh as Maven connects with J-unit.
//whenever i run my program, sometimes i get error "element not found"
//but again i rerun without fixing the error, same error is gone by itself.
//..why this is happening??

package assignments;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {

	}

	@AfterClass
	public static void afterClass() {

	}

	@Before

	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}

	@Test
	public void test() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Bank & Cash")).click();
		driver.findElement(By.partialLinkText("New Account")).click();
		driver.findElement(By.id("account")).sendKeys("nnsvdvsnv");
		driver.findElement(By.id("description")).sendKeys("kjdhsfjs");
		driver.findElement(By.id("balance")).sendKeys("25462");
		driver.findElement(By.id("account_number")).sendKeys("151515");
		driver.findElement(By.id("contact_person")).sendKeys("mdjhfkh");
		driver.findElement(By.id("contact_phone")).sendKeys("254-444-5674");
		driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/button")).click();

		Thread.sleep(8000);

	}

	/*
	 * @Test public void negTest() throws InterruptedException {
	 * 
	 * driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	 * driver.findElement(By.id("password")).sendKeys("abc12344");
	 * driver.findElement(By.name("login")).click(); 
	 * Thread.sleep(5000);
	 * 
	 * }
	 */

	@After
	public void tearDown() {

		driver.close();
	}

}
