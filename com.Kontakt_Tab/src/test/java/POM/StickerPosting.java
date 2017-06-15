package POM;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class StickerPosting {

	private static WebElement element = null;
	static Dimension size;	
	public static String s;
	public static String s3;
	 public static WebElement Select_KontaktTelecom_Sticker1(AndroidDriver driver) throws InterruptedException
	 {
		 Thread.sleep(5000);
		 driver.tap(1,130,945,1);
		  Thread.sleep(3000);
		  driver.tap(1,100,1100,1);
		  Thread.sleep(3000);
	     element = driver.findElement(By.name("Kontakt Telecom"));
	 
	    return element;
	 
	    }
	 
		
	public static WebElement Next_Button(AndroidDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		  element = driver.findElement(By.name("Next"));
		 
		  return element;
		 
	 }
		 
		 
	public static WebElement Send_Button(AndroidDriver driver) throws InterruptedException
	{
	Thread.sleep(2000);
			element = driver.findElement(By.name("Send"));
			 
			 return element;
			 
	}
		
	
	public static WebElement StartMessage(AndroidDriver driver) throws InterruptedException
	 {
		Thread.sleep(2000);
	     element = driver.findElement(By.name("Start a new message"));
	 
	    return element;
	 
	    }
				
	public static  String Sticker1_Output(AndroidDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		  driver.swipe(0,0,0,250,1000);
		  Thread.sleep(10000);
		  String s=driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[114,765][640,1014]']")).getText();
		  Thread.sleep(5000);
		  System.out.println(s.substring(57,85));
		  Thread.sleep(2000);
				 
		 return s;
				 
	}
				 
				 
	public static WebElement Select_KontaktTelecom_Sticker2(AndroidDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.tap(1,130,945,1);
		Thread.sleep(3000);
		driver.tap(1,300,1100,1);
		Thread.sleep(3000);
		element = driver.findElement(By.name("Kontakt Telecom"));
					 
		 return element;
					 
}
	
	public static  String Sticker2_Output(AndroidDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		  driver.swipe(0,0,0,250,1000);
		  Thread.sleep(5000);
		  String s1=driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[114,851][640,1014]']")).getText();
		  System.out.println(s1);
				 
		 return s1;
				 
	}
	
	public static  float Sticker2_OutputValidation(AndroidDriver driver) throws InterruptedException
	{
		  
		  driver.findElement(By.name("Start a new message")).sendKeys("Get Balance");
		  driver.findElement(By.name("Send")).click();
		  driver.hideKeyboard();
		  driver.swipe(0,0,0,250,1000);
		  Thread.sleep(10000);
		  String s3=driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[114,765][640,1014]']")).getText();
		  String s4=s3.substring(58,63);
		  float Balance = Float.parseFloat(s4);
		  System.out.println(Balance);
				 
		 return Balance;
				 
	}
	
	
	public static WebElement Select_KontaktTelecom_Sticker3(AndroidDriver driver) throws InterruptedException
	 {
		Thread.sleep(5000);
		driver.tap(1,130,945,1);
		  Thread.sleep(3000);
		  driver.tap(1,500,1100,1);
		  Thread.sleep(3000);
	     element = driver.findElement(By.name("Kontakt Telecom"));
	 
	    return element;
	 
	    }
	 

			 
				
	public static  String Sticker3_Output(AndroidDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		  driver.swipe(0,0,0,250,1000);
		  Thread.sleep(5000);
		  String s5=driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[114,851][640,1014]']")).getText();
		  Thread.sleep(5000);
		 
		  System.out.println(s5);
				 
		 return s5;
				 
	}
				 
				 
	
	public static  float Sticker3_OutputValidation(AndroidDriver driver) throws InterruptedException
	{
		
		  driver.findElement(By.name("Start a new message")).sendKeys("Get Balance");
		  driver.findElement(By.name("Send")).click();
		  driver.hideKeyboard();
		  driver.swipe(0,0,0,250,1000);
		  Thread.sleep(5000);
		  String s7=driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[114,765][640,1014]']")).getText();
		  String s8=s7.substring(58,63);
		  float GetBalance = Float.parseFloat(s8);
		  System.out.println(GetBalance);
		  
		  return GetBalance;
				 
	}
	
	public static WebElement Select_KontaktTelecom_Sticker4(AndroidDriver driver) throws InterruptedException
	 {
		Thread.sleep(5000);
		driver.tap(1,130,945,1);
		size = driver.manage().window().getSize();
		  Thread.sleep(3000);
		  int startx = (int) (size.width * 0.90);
		  int endx = (int) (size.width * 0.10);
		  int starty = 1000;	   
		  driver.swipe(startx, starty, endx, starty, 3000);
		  Thread.sleep(5000);
		  driver.tap(1,700,1100,1);
		  Thread.sleep(2000);
	     element = driver.findElement(By.name("Kontakt Telecom"));
	 
	    return element;
	 
	    }
	 

			 
				
	public static  AndroidDriver Sticker4_Output(AndroidDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		  driver.swipe(0,0,0,250,1000);
		  Thread.sleep(5000);
		  String s=driver.findElement(By.id("com.twitter.android:id/content")).getText();
		  Thread.sleep(5000);
		  System.out.println(s);
		  return driver;
				 
	}
	
	public static WebElement Select_KontaktTelecom_Sticker5(AndroidDriver driver) throws InterruptedException
	 {
		Thread.sleep(5000);
		driver.tap(1,130,945,1);
		size = driver.manage().window().getSize();
		Thread.sleep(2000);
		  int startx = (int) (size.width * 0.90);
		  int endx = (int) (size.width * 0.10);
		  int starty = 1600;	   
		  driver.swipe(startx, starty, endx, starty, 1000);
		  Thread.sleep(5000);
		  driver.tap(1,980,1600,1);
		  Thread.sleep(2000);
	     element = driver.findElement(By.name("Kontakt Telecom"));
	 
	    return element;
	 
	    }
	
	public static WebElement Select_KontaktTelecom_Sticker6(AndroidDriver driver) throws InterruptedException
	 {
		driver.tap(1,175,1213,1);
		size = driver.manage().window().getSize();
		  Thread.sleep(2000);
		  int startx = (int) (size.width * 0.90);
		  int endx = (int) (size.width * 0.10);
		  int starty = 1600;
		  driver.swipe(startx, starty, endx, starty, 1000);
		  Thread.sleep(5000);
		  driver.swipe(startx, starty, endx, starty, 1000);
		  Thread.sleep(5000);
		  driver.tap(1,400,1600,1);
		  Thread.sleep(2000);
	     element = driver.findElement(By.name("Kontakt Telecom"));
	 
	    return element;
	 
	    }
	
	public static WebElement Select_KontaktTelecom_Sticker7(AndroidDriver driver) throws InterruptedException
	 {
		Thread.sleep(2000);
		size = driver.manage().window().getSize();
		  driver.tap(1,175,1213,1);
		  Thread.sleep(2000);
		  int startx = (int) (size.width * 0.90);
		  int endx = (int) (size.width * 0.10);
		  int starty = 1600;
		   
		  driver.swipe(startx, starty, endx, starty, 1000);
		  Thread.sleep(5000);
		  driver.swipe(startx, starty, endx, starty, 1000);
		  Thread.sleep(2000);
		  driver.tap(1,820,1600,1);
		  Thread.sleep(2000);
	     element = driver.findElement(By.name("Kontakt Telecom"));
	 
	    return element;
	 
	    }
	
	public static WebElement Select_KontaktTelecom_Sticker8(AndroidDriver driver) throws InterruptedException
	 {
		Thread.sleep(2000);
		size = driver.manage().window().getSize();
		  driver.tap(1,175,1213,1);
		  Thread.sleep(2000);
		  int startx = (int) (size.width * 0.90);
		  int endx = (int) (size.width * 0.10);
		  int starty = 1600;
		   
		  driver.swipe(startx, starty, endx, starty, 1000);
		  Thread.sleep(5000);
		  int startx1 = (int) (size.width * 0.90);
		  int endx1 = (int) (size.width * 0.10);
		  int starty1 = 1600;
		   
		  driver.swipe(startx1, starty1, endx1, starty1, 1000);
		  Thread.sleep(5000);
		  driver.swipe(startx1, starty1, endx1, starty1, 1000);
		  driver.tap(1,820,1600,1);
		  Thread.sleep(2000);
	     element = driver.findElement(By.name("Kontakt Telecom"));
	 
	    return element;
	 
	    }
	
	
}
