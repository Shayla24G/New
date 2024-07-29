package demoBlaze.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class DemoBlazeBASE {
	public static WebDriver driver;
	public static Properties ecommerceProp;
	
	public  DemoBlazeBASE () {
		
		try {
			FileInputStream ecommerceFile = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\demoBlaze\\configuration\\DemoBlazeConfig.properties");
			ecommerceProp = new Properties (); 
			ecommerceProp.load(ecommerceFile);
		} catch (FileNotFoundException e) {
			System.out.println("Please fixed your constructor");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		
		//BrowserSetup
	public void ecommerceBrowserSetup() { 
		String ecommerceAllBrowser = ecommerceProp.getProperty("BlazeBrowser1");
		
		if(ecommerceAllBrowser.equals("Chrome")) {
		
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"demoBlazeDriver\\chromedriver.exe");
			
			ChromeOptions eb = new ChromeOptions();
			eb.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //not took time to open URL 
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //took time to open URL
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DemoBlazeUtility.implicitlyWait));  
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(DemoBlazeUtility.pageLoadTimeout)); 
			driver.manage().deleteAllCookies();
			
			
		}
		else if(ecommerceAllBrowser.equals("IE"))
		{
			
		}
	}
		//LunchURLSetup
		 public static void ecommerceURLSetup (String URL){ //parameter korbo tai string lagbey, this method is responsible for launching url
			
			driver.get(ecommerceProp.getProperty("BlazeURL")); // url is opening from here
			 //driver.get("https://askomdch.com/ ");
			 
		 }
	
	}

