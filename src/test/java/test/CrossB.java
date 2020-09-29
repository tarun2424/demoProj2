package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CrossB {
	
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		if(browser.equalsIgnoreCase("firefox")) {
	     System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
	     driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			    driver=new ChromeDriver();
		}
		else {
			throw new Exception("Browser not correct");
		}
	}

	//Test method
	
	@Test
	public void demo() throws InterruptedException
	{
		
	    driver.get("http://jpetstore.cfapps.io/login");
	    driver.findElement(By.name("username")).sendKeys("demo1");
	    driver.findElement(By.name("password")).sendKeys("abcd@1234");
	    Thread.sleep(2000);
	    driver.findElement(By.id("login")).click();

		}
	}
