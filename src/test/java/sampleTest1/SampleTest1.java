package sampleTest1;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {

		
		@Test
		public void loginTest () throws IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
			wd.get("https://www.google.com/");
			
			File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			
			///Users/e11/Documents/online/workspace/batch181/C2_WebdriverTest/screenshot
			//FileUtils //appache //1.0, 2.0
			FileHandler.copy(src, new File("C:\\Users\\Anitha\\eclipse-workspace\\gitTest\\screenShot\\google.png"));
		}
		
	}


