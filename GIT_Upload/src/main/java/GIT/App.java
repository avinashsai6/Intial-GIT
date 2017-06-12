package GIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class App 
{
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void SignUp() throws InterruptedException
	{	

		String Title=driver.getTitle();
		System.out.println(Title);
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{	

		driver.quit();
	}
}

