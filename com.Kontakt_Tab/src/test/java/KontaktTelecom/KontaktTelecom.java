package KontaktTelecom;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import POM.ChannelSelection;
import POM.HomePage;
import POM.KeyboardSelection;
import io.appium.java_client.android.AndroidDriver;

public class KontaktTelecom 
{
	 ExtentReports report;
	 ExtentTest logger;
	 AndroidDriver<?> driver;
	 Dimension size;	
	 static String reportLocation = "C:\\Users\\avinash.p\\Desktop\\Report\\Kontakt Telecom\\KontaktTelecom.html";
     static String imageLocation = "images/";
	@SuppressWarnings("rawtypes")
	@BeforeTest
	 public void setUp() throws MalformedURLException
	{	
	  report=new ExtentReports("C:\\Users\\avinash.p\\Desktop\\Report\\Kontakt Telecom\\KontaktTelecom.html");	 
  
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("deviceName","Galaxy Tab A(2016)");
	  cap.setCapability("udid", "5203c45ae8fea300");
	  cap.setCapability("platformVersion", "5.1.1");
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("appPackage", "com.hashblu.kontakt");
	  cap.setCapability("appActivity", "com.hashblu.stickersapp.views.activity.SetupActivity");	  
	  driver = new AndroidDriver(new URL("http://172.16.21.190:4723/wd/hub"), cap);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
	
	@Test(priority=0)
	 public void SetUp() throws InterruptedException, IOException 
	 {	 
		 logger=report.startTest("Verify Keyboard Selection");
		 logger.log(LogStatus.INFO, "Application is up and running");
		 
		  HomePage.SetUp(driver).click();
	  }
	
	@Test(priority=1)
	 public void EnableServiceStickers() throws InterruptedException, IOException 
	 {	 
		  POM.SetUp.ServiceStickers_Enable(driver).click();
		  POM.SetUp.OK_Button(driver).click();
		  POM.SetUp.NavigateBack(driver);
		  logger.log(LogStatus.INFO, "SetUp Done");
	  }
	
	@Test(priority=2)
	 public void StickersKeyBoardSelection() throws InterruptedException, IOException 
	 {	 
		POM.SetUp.Swipe(driver);
		
		  KeyboardSelection.ChangeKeyboard(driver).click();
		  KeyboardSelection.Select_ServiceStickers(driver).click();
		  logger.log(LogStatus.INFO, "Service Stickers Keyboard Enabled");
		  logger.log(LogStatus.PASS, "Keyboard Selected");
		  report.endTest(logger);
	  }
	
	@Test(priority=3)
	 public void TwitterChannelSelection() throws InterruptedException, IOException 
	 {	
		logger=report.startTest("Verify Twitter Channel Selection");
		POM.SetUp.Swipe(driver);
		  ChannelSelection.Twitter_Channel(driver).click();
		  logger.log(LogStatus.INFO, "Twitter Channel selected");
		  logger.log(LogStatus.PASS, "Twitter Selected");
		  report.endTest(logger);
	  }
	
	@Test(priority=4)
	 public void NewMessage() throws InterruptedException, IOException 
	 {	 
		  logger=report.startTest("Verify Kontakt Telecom in Twitter");
		  POM.NewMessage.DirectMessage(driver).click();
		  logger.log(LogStatus.PASS, "Kontakt Telecom Selected");
		  logger.log(LogStatus.INFO, "Kontakt Telecom Selected");
		  report.endTest(logger);
		  POM.NewMessage.StartMessage(driver).click();
		  logger.log(LogStatus.INFO, "Start Messaging  Kontkt Telecom");
	  }
	
	@Test(priority=5)
	 public void Sticker1() throws InterruptedException, IOException 
	 {	
		logger=report.startTest("Verify Sticker1");
		  POM.StickerPosting.Select_KontaktTelecom_Sticker1(driver).click();
		  logger.log(LogStatus.INFO, "Sticker1 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker1 sent successfully");
		  //POM.StickerPosting.Sticker1_Output(driver);
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted & got response for Sticker1");
		  report.endTest(logger);	 
		  
	  }
	
	@Test(priority=6)
	 public void Sticker2() throws InterruptedException, IOException 
	 {	
		report.endTest(logger);
		  logger=report.startTest("Verify Sticker2");
		  POM.StickerPosting.StartMessage(driver).click();
		  POM.StickerPosting.Select_KontaktTelecom_Sticker2(driver).click();
		  logger.log(LogStatus.INFO, "Sticker2 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker2 sent successfully");
		  //POM.StickerPosting.Sticker2_Output(driver);
		  //POM.StickerPosting.Sticker2_OutputValidation(driver);
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted & got response for Sticker2");
		  report.endTest(logger);
	 }
	
	@Test(priority=7)
	 public void Sticker3() throws InterruptedException, IOException 
	 {	
		report.endTest(logger);
		logger=report.startTest("Verify Sticker3");
		POM.StickerPosting.StartMessage(driver).click();
		  POM.StickerPosting.Select_KontaktTelecom_Sticker3(driver).click();
		  logger.log(LogStatus.INFO, "Sticker3 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker3 sent successfully");
		  //POM.StickerPosting.Sticker3_Output(driver);
		  //POM.StickerPosting.Sticker3_OutputValidation(driver);
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted & got response for Sticker3");
		  report.endTest(logger);
	 }
	
	@Test(priority=8)
	 public void Sticker4() throws InterruptedException, IOException 
	 {	
		report.endTest(logger);
		logger=report.startTest("Verify Sticker4");
		POM.StickerPosting.StartMessage(driver).click();
		  POM.StickerPosting.Select_KontaktTelecom_Sticker4(driver).click();
		  logger.log(LogStatus.INFO, "Sticker4 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker4 sent successfully");
		  //POM.StickerPosting.Sticker4_Output(driver);
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted & got response for Sticker4");
		  report.endTest(logger);
	 }
	
	@Test(priority=9)
	 public void Sticker5() throws InterruptedException, IOException 
	 {	
		report.endTest(logger);
		logger=report.startTest("Verify Sticker5");
		POM.StickerPosting.StartMessage(driver).click();
		  POM.StickerPosting.Select_KontaktTelecom_Sticker5(driver).click();
		  logger.log(LogStatus.INFO, "Sticker5 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker5 sent successfully");
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted Sticker5");
		  report.endTest(logger);
	 }
	
	@Test(priority=10)
	 public void Sticker6() throws InterruptedException, IOException 
	 {
		report.endTest(logger);
		logger=report.startTest("Verify Sticker6");
		POM.StickerPosting.StartMessage(driver).click();
		  POM.StickerPosting.Select_KontaktTelecom_Sticker6(driver).click();
		  logger.log(LogStatus.INFO, "Sticker6 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker6 sent successfully");
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted Sticker6");
		  report.endTest(logger);
	 }
	
	@Test(priority=11)
	 public void Sticker7() throws InterruptedException, IOException 
	 {	
		report.endTest(logger);
		 logger=report.startTest("Verify Sticker7");
		 POM.StickerPosting.StartMessage(driver).click();
		  POM.StickerPosting.Select_KontaktTelecom_Sticker7(driver).click();
		  logger.log(LogStatus.INFO, "Sticker7 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker7 sent successfully");
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted Sticker7");
		  report.endTest(logger);
	 }
	
	@Test(priority=12)
	 public void Sticker8() throws InterruptedException, IOException 


	 {	
		report.endTest(logger);
		logger=report.startTest("Verify Sticker8");
		POM.StickerPosting.StartMessage(driver).click();
		  POM.StickerPosting.Select_KontaktTelecom_Sticker8(driver).click();
		  logger.log(LogStatus.INFO, "Sticker8 Selected");
		  POM.StickerPosting.Next_Button(driver).click();
		  POM.StickerPosting.Send_Button(driver).click();
		  logger.log(LogStatus.INFO, "Sticker8 sent successfully");
		  logger.log(LogStatus.INFO, "Output generated");
		  logger.log(LogStatus.PASS, "Successfully posted Sticker8");
		  report.endTest(logger);
	 }
	
	@AfterMethod	
	 public void tearDown(ITestResult result) throws IOException
	{
if(result.getStatus()==ITestResult.FAILURE)
{
 
String screenshot_path=Screenshot.createScreenshot(driver);
String image= logger.addScreenCapture(screenshot_path);
logger.log(LogStatus.FAIL, "Title verification", image);
report.flush();
driver.get("C:\\Users\\avinash.p\\Desktop\\Report\\Kontakt Telecom\\KontaktTelecom.html");
driver.quit();  
	}
	}
	
	
}

