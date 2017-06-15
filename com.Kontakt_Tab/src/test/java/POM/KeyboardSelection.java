package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class KeyboardSelection 
{
	private static WebElement element = null;
	static Dimension size;	
	
	
	
	 public static WebElement ChangeKeyboard(AndroidDriver driver) throws InterruptedException
	 {
		 
		  
		  Thread.sleep(5000);
		  driver.openNotifications();
		  element=driver.findElement(By.name("Select keyboard"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement Select_ServiceStickers(AndroidDriver driver) throws InterruptedException
	 {
	     element = driver.findElement(By.name("Service Stickers"));
	 
	    return element;
	 
	    }
}
