package POM;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SetUp 
{
	private static WebElement element = null;
	static Dimension size;
	 public static WebElement ServiceStickers_Enable(AndroidDriver driver) throws InterruptedException
	 {
		 Thread.sleep(5000);
		 element = driver.findElement(By.name("Service Stickers"));
		 
		    return element;
		
	 
	    }
	 
	 public static WebElement OK_Button(AndroidDriver driver) throws InterruptedException
	 {
		 Thread.sleep(5000);
		 element = driver.findElement(By.name("OK"));
		 
		 
		    return element;
	 
	    }
	 
	 public static AndroidDriver NavigateBack(AndroidDriver driver) throws InterruptedException
	 {
		 
		 driver.navigate().back();
		 return driver;
	 
	    }
	 
	 
	 public static AndroidDriver Swipe(AndroidDriver driver) throws InterruptedException
	 {
		 Thread.sleep(5000);
		 size = driver.manage().window().getSize();
		  int startx = (int) (size.width * 0.90);   
		  int endx = (int) (size.width * 0.10);
		  int starty = size.height / 2;
		  driver.swipe(startx, starty, endx, starty, 3000);
		  
		  return driver;
		
	 
	    }
}
