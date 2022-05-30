package Com.OrangeHRM5.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
WebDriver driver;

@BeforeTest
public void Brouseropen()
{
	System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("Enter URl");
	driver.manage().window().maximize();
	
	
	}

public void CaptureScreenShort(WebDriver driver,String screenshortname) throws Exception{
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source,new File(System.getProperty("user.dir")+"\\Screenshorts\\"+screenshortname+".png") );
	
}


@AfterTest
 public void brouserclose()
{
	
	driver.close();
	
}
}
