package com.demo.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream("C:\\Users\\qunoot.ahmed\\eclipse-workspace\\"
					+ "TutorialsNinjaDemo\\src\\main\\java\\com\\demo\\config\\config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	
	public static void waitForElement(WebDriver driver, WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOf(elem));
	}
	
	public String getExcelPath() {
		String excelpath = prop.getProperty("excelPath");
		if(excelpath !=null)
			return excelpath;
		else throw new RuntimeException("Excel path not found");
	}
	
}
