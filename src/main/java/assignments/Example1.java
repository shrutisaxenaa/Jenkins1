package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	 static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		//so here, we can create so many negative test cases
		//and call them into the main method but this approach is 
		//not good as if we miss the sequence we will miss the correct 
		//output too. so that is the reason we use J-unit framework.
		
		
		init();
		test();
		tearDown();
		
		init();
		negTest();
		tearDown();
		
				
	}
	
	public static void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
		driver=new ChromeDriver();// need to ask ,are we allowed to do that, this is not how we make object.
		
		driver.get(" http://www.techfios.com/billing/?ng=admin/");
		
		driver.manage().window().maximize();
		
	}
	
	public static void test() throws InterruptedException {
		
  driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		
	}
	public static void negTest() throws InterruptedException {
		
		  driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				
				driver.findElement(By.id("password")).sendKeys("abc1234");
				
				driver.findElement(By.name("login")).click();
				
				Thread.sleep(3000);
				
				
			}
	public static void tearDown() throws InterruptedException {
		

		driver.close();
	}

}
