package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Annotate 
{

	public static void AnnotateElement(AndroidDriver driver,WebElement element)
	{
		JavascriptExecutor webdriver=(JavascriptExecutor)driver;
		webdriver.executeScript("arguments[0].setattribute('style',arguments[1]);",element,"border: 2px solid red;");
	}
}
