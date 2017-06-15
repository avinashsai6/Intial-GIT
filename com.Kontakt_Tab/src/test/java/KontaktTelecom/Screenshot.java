package KontaktTelecom;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	 
public class Screenshot 
{
		static String reportLocation = "C:\\Users\\avinash.p\\Desktop\\Report\\Kontakt Telecom\\KontaktTelecom.html";
	    static String imageLocation = "images/";
		public static String createScreenshot(WebDriver driver) {
			 
		    UUID uuid = UUID.randomUUID();
		 
		    // generate screenshot as a file object
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    try {
		        // copy file object to designated location
		        FileUtils.copyFile(scrFile, new File("C:\\Users\\avinash.p\\Desktop\\Report\\Kontakt Telecom\\KontaktTelecom.html" + imageLocation + uuid + ".png"));
		    } catch (IOException e) {
		        System.out.println("Error while generating screenshot:\n" + e.toString());
		    }
		    return reportLocation + imageLocation + uuid + ".png";
		}
}
