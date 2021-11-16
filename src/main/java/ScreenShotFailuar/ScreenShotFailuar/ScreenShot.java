package ScreenShotFailuar.ScreenShotFailuar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32_93\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//takeScreenShot("Google_LoginPage");
	}
	public static void takeScreenShot(String fileName) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("D:\\EclipseWorkspace\\ScreenShotFailuar\\ScreenShot"+fileName+".jpg"));
	}

}
