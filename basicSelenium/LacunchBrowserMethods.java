package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LacunchBrowserMethods {
	
	
	  public static void usingSysytemProperty() {
	  
	  System.setProperty("webdriver.edge.driver",
	  "C:\\EdgeDriver\\msedgedriver.exe");
	  
	  EdgeDriver driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  
	  }
	 
	
	
	  public static void usingWebDriver() { //BONIGARCIA
	  
	  WebDriverManager.firefoxdriver().setup();
	  
	  FirefoxDriver driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	  driver.get("https://www.youtube.com/"); }
	  
	  
	
	  public static void usingSeleniumManager() {
	  
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	  
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  
	  }
	 
	
	public static void main(String[] args) {
		
		
		  usingWebDriver();
		  
		 usingSeleniumManager(); 
		 
		 usingSysytemProperty(); 
	}

}
