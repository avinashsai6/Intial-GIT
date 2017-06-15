package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class HomePage 
{
	private static WebElement element = null;
	static Dimension size;	
	 public static WebElement SetUp(AndroidDriver driver) throws InterruptedException
	 {
		 Thread.sleep(10000);
		 size = driver.manage().window().getSize();
		 int startx = (int) (size.width * 0.70);  
		 int endx = (int) (size.width * 0.30);  
		 int starty = size.height / 2;
		 driver.swipe(startx, starty, endx, starty, 3000);
		 Thread.sleep(5000);
	     element = driver.findElement(By.name("SETUP"));
	     //Annotate.AnnotateElement(driver, element);
	    return element;
	 
	    }
}