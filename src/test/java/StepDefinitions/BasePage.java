package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {


 public static WebDriver driver;
	public static void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
	}
	}

 public static void enterUrl(String url) {
	 driver.get(url);
	 
 }
 }

