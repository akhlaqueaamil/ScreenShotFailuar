package ScreenShotFailuar.ScreenShotFailuar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static void initilization() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32_93\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");		
	}
	public void failed(String testMethodName) {
		File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile,new File("D:\\EclipseWorkspace\\ScreenShotFailuar\\ScreenShot"));
		
			try {
				//FileUtils.copyFile(scrFile, new File("D:\\EclipseWorkspace\\ScreenShotFailuar\\ScreenShot\\TestFaiuar.png"));
				//FileUtils.copyFile(scrFile, new File("D:\\EclipseWorkspace\\ScreenShotFailuar\\ScreenShot\\"+testMethodName+"_"+".jpg"));
				FileUtils.copyFile(scrFile, new File("D:\\EclipseWorkspace\\ScreenShotFailuar\\ScreenShot\\"+testMethodName+"_"+".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
