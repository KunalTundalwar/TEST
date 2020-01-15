package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {
	 public static void main(String[] args) {
	        
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
		 System.setProperty("webdriver.gecko.driver","D:\\SELENIUM SETTING FILES DONT TOUCH\\WEB DRIVERS\\firefox\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();


			 String baseUrl = "http://demo.guru99.com/test/newtours/";
		        String expectedTitle = "Welcome: Mercury Tours";
		        String actualTitle = "";
		        driver.get(baseUrl);
		        actualTitle = driver.getTitle();
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }
		       
		        //close Fire fox
		        driver.close();
}
}