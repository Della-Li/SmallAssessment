/**
 * @author: Della Li  Email: lyfyxy66@gmail.com
 * @date: April 30, 2021
 * @methodsName: base
 * @description: startup browser and close browser
 * @param: 
 * @return: 
 * @throws: 
 **/
package basicweb;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public String astBaseUrl;
	

	
	public void startBrowser() throws IOException {
		
		// Read configure file and get the parameters
		FileInputStream file = new FileInputStream(
			    "E:\\QAassessment\\GlobalData.properties");
		Properties prop = new Properties();
		prop.load(file);
		String browser = prop.getProperty("browserType");
		
		// get the driver type
		String chromeDri = prop.getProperty("chrome_driver");
		String firefoxDri = prop.getProperty("firefox_driver");
		String ieDri = prop.getProperty("ie_driver");
		
		// get the driver path	
		String chromeDriverPath = prop.getProperty("chrome_driver_path");
		String firefoxDriverPath = prop.getProperty("firefox_driver_path");
		String ieDriverPath = prop.getProperty("ie_driver_path");
		
		if ("chrome".equals(browser)) {
			System.setProperty(chromeDri, chromeDriverPath);
			driver = new ChromeDriver();
		}else if("firefox".equals(browser)) {
			System.setProperty(firefoxDri, firefoxDriverPath);
			driver = new FirefoxDriver();
		}else if("ie".equals(browser)) {
			System.setProperty(ieDri, ieDriverPath);
			driver = new InternetExplorerDriver();
		}
		
		astBaseUrl = prop.getProperty("url");
		driver.get(astBaseUrl);
	
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	}

	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}	


}
