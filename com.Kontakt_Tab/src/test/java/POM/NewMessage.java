package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class NewMessage 
{
	private static WebElement element = null;
	public static WebElement DirectMessage(AndroidDriver driver) throws InterruptedException
	 {
		 
	     element = driver.findElement(By.name("Send a direct message to this user"));
	 
	    return element;
	 
	    }
	public static WebElement StartMessage(AndroidDriver driver) throws InterruptedException
	 {
		 
	     element = driver.findElement(By.name("Start a new message"));
	 
	    return element;
	 
	    }
}
