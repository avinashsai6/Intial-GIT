package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ChannelSelection 
{
	private static WebElement element = null;
	static Dimension size;	
	 public static WebElement Twitter_Channel(AndroidDriver driver) throws InterruptedException
	 {
	     element = driver.findElement(By.name("Follow @kontaktexpress >>"));
	 
	    return element;
	 
	    }
}
